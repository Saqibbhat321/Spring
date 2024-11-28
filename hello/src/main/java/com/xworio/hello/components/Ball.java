package com.xworio.hello.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Ball {

    @Autowired
    private Double ballCost;
    public Ball()
    {
        System.out.println("Ball component");
    }
}
