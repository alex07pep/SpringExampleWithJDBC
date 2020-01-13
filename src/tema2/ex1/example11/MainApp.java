package tema2.ex1.example11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

        public static void main(String[] args)
        {
            ApplicationContext context=new ClassPathXmlApplicationContext("Beans11.xml");
            Persoana p=(Angajat)context.getBean("angajat");
            System.out.println(p);
        }

    }
