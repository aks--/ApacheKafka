package com.anurag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurentDemo {
    public static void main(String args[]){

        ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("apptest.xml");

        Restaurent resto = (Restaurent)appcontext.getBean("restaurent");
//        resto.setName("anuragresto");
//        resto.setType("GNV");
        System.out.println(resto);
    }
}
