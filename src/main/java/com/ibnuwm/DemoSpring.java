package com.ibnuwm;

import com.ibnuwm.entity.Address;
import com.ibnuwm.entity.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc.xml");
        Person person = (Person) context.getBean("ibnu");
        // Address address = (Address) context.getBean("serang");

        System.out.println("Nama : " + person.getNama());
        System.out.println("Alamat : " + person.getAlamat().getJalan());
    }
}
