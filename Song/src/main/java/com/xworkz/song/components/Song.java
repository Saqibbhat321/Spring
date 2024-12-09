package com.xworkz.song.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class Song {

    public Song(){
       // System.out.println("Song is created");
    }

    @RequestMapping("/press")
    public String onPress(){
        System.out.println("created onPress");
        return "index.jsp";
    }

    @RequestMapping("/save")
    public String onSave(){
        System.out.println("Created onSave");
        return "index.jsp";
    }
}
