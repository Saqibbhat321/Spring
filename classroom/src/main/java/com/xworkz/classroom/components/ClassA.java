package com.xworkz.classroom.components;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
@Component
public class ClassA implements Configuration {


public ClassA()
{
    System.out.println("runnning component one");
}

    @Override
    public String value() {
        return "";
    }

    @Override
    public boolean proxyBeanMethods() {
        return false;
    }



    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
