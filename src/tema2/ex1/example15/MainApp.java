package tema2.ex1.example15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String []args)
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans15.xml");
        //Figura f=(Figura)context.getBean("cerc");
        Figura f=(Figura)context.getBean("dreptunghi");
        f.aria();
    }
}