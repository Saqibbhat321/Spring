package com.xworkz.propertyannotation.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BangaloreCity {


    @Autowired
    @Qualifier("hills")
    private Hills hills;
    public  BangaloreCity()
    {
        System.out.println("Bangalore city object created by Spring container");
    }
}
