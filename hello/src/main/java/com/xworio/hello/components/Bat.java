package com.xworio.hello.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bat {
    @Autowired
    private Double batCost;

    public Bat()
    {
        System.out.println("Bat Component Called");
    }
}
