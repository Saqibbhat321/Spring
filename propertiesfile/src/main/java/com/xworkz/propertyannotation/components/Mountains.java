package com.xworkz.propertyannotation.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Mountains {

    @Autowired
    @Qualifier("famousCity")
    private String cityFamous;

    public Mountains() {
        System.out.println("mountain constructor");
    }
}
