package tema2.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("BeansEx2.xml");
        Vehicul v1=(Vehicul)context.getBean("bmw");
        Vehicul v2=(Vehicul)context.getBean("yamaha");
        Vehicul v3=(Vehicul)context.getBean("tir1");
        Vehicul v4=(Vehicul)context.getBean("tir2");
        Vehicul v5=(Vehicul)context.getBean("audi");

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        System.out.println(v5.toString());
    }
}
