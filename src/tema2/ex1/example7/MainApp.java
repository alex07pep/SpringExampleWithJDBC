package tema2.ex1.example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MainApp
{
    public static void main(String []args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("./Beans7.xml");
        Persoana p=(Persoana)context.getBean("pers");
        System.out.print(p);
    }
}
