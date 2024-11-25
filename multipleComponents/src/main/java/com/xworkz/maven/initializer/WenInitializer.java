package com.xworkz.maven.initializer;

import com.xworkz.maven.components.ComponentOne;
import com.xworkz.maven.components.ComponentTwo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@ComponentScan("com.xworkz.maven")
@Configuration
public class WenInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("enable to let server handle static resources");
        configurer.enable();
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ComponentOne.class, ComponentTwo.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("used to merge different servlet classes to fc servlet");
        return new String[]{"/"};
    }


}
