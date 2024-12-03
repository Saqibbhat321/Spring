package com.xworkz.propertyannotation.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Palestine {
    @Autowired
    @Qualifier("add")
    private int addition;

    @Value("${name}")
    private String name;
    @Value("${location}")
    private String location;
    public Palestine()
    {
        System.out.println("this is palestine");
    }
    @PostConstruct
    public void display()
    {
        System.out.println("her: "+name);
        System.out.println("location: "+location);
    }

}
