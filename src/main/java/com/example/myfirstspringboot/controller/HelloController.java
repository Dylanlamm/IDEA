package com.example.myfirstspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;

    @Value("${address[0]}")
    private String address;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @RequestMapping("/hello2")
     public String hello2(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(env.getProperty("address[1]"));
        System.out.println(person);
        String[] address = person.getAddress();
        for (String s : address) {
            System.out.println(s);
        }

        return "hello springBoot!";
     }
     @RequestMapping("/hello")
     public String hello(){
         return "hello springBoot!";
     }
}
