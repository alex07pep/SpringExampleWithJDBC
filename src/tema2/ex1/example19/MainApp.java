package tema2.ex1.example19;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String []args)
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans19.xml");
        Persoana p=(Persoana)context.getBean("pers");
        System.out.println(p);
        context.registerShutdownHook();
    }
}
