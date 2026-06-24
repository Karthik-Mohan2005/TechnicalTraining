package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Using Annotation Based Configurations
public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
       //Gadgets obj = (Gadgets) context.getBean("PS5");
        //obj.use();
        Brand obj = (Brand) context.getBean("brand");
        System.out.println(obj);
    }
}