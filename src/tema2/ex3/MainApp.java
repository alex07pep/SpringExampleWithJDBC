package tema2.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.List;

public class MainApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String licensePlate, model, color;
        int productionYear,kilometers;

        ApplicationContext context =new ClassPathXmlApplicationContext("BeansEx3.xml");
        CarDAO carDao =(CarDAO)context.getBean("opJDBC");

        int Choice=9;
        boolean loop_condition = true;
        List<Car> cars;
        List<Car> allCars;

        while (loop_condition)
        {
            System.out.println("\n");
            System.out.println("1.Add Car");
            System.out.println("2.Delete Car");
            System.out.println("3.Search for Car");
            System.out.println("4.List Cars");
            System.out.println("5.Search after model");
            System.out.println("6.Cars under 100.000km");
            System.out.println("7.Cars under 5 years old");
            System.out.println("0.To exit");
            System.out.print("Pick:");

            try{
                Choice = Integer.parseInt(br.readLine());
            }catch(NumberFormatException nfe){
                System.err.println("Invalid Format!");
            }

            switch(Choice)
            {
                case 0:
                    loop_condition=false;
                    break;
                case 1:
                    System.out.println("Car license plate:");
                    licensePlate = br.readLine();
                    System.out.println("Production year:");
                    productionYear = Integer.parseInt(br.readLine());
                    System.out.println("Color:");
                    color = br.readLine();
                    System.out.println("Km:");
                    kilometers= Integer.parseInt(br.readLine());
                    System.out.println("Model:");
                    model = br.readLine();

                    carDao.insert(licensePlate,productionYear,color,kilometers, model);
                    break;
                case 2:
                    System.out.println("Car license plate:");
                    licensePlate = br.readLine();
                    carDao.delete(licensePlate);

                    break;
                case 3:
                    System.out.println("Car license plate:");
                    licensePlate = br.readLine();
                    Car searchedCar = carDao.getCar(licensePlate);
                    System.out.println(searchedCar.toString());

                    break;
                case 4:
                    cars = carDao.getAllCars();
                    for (Car p : cars)
                    {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.println("Car model:");
                    model = br.readLine();
                    cars = carDao.getCarsModel(model);
//                    for (Car p : cars)
//                    {
//                        System.out.println(p);
//                    }
                    System.out.println(cars.size()+ " masini cu marca: " + model );
                    break;
                case 6:
//                    cars = carDao.getCarsUnder100Km();
                    allCars = carDao.getAllCars();
                    int under100km = 0;
                    for (Car p : allCars)
                    {
                        if(p.getKilometers() < 100000) {
                            under100km++;
//                            System.out.println(p);
                        }

                    }
//                    System.out.println(cars.size());
                    System.out.println((under100km/(float)allCars.size()) * 100 + "% din Masini au mai putin de 100 000 km parcursi");
                    break;
                case 7:
                    int year = Calendar.getInstance().get(Calendar.YEAR);
                    year = year - 5;
                    cars = carDao.getCarsUnder5Years(year);
                    for (Car p : cars)
                    {
                        System.out.println(p);
                    }
                    break;
                default:  System.err.println("Invalid! Pick again!"); break;
            }

        }

    }


}

