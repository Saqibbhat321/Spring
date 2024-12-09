package com.xworkz.song.components;

import com.xworkz.song.DTO.MatrimonyDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Component
@RequestMapping("/")
public class MatrimonyComponent {
    public MatrimonyComponent()
    {
        System.out.println(("MatrimonyComponent created"));
    }
@RequestMapping("/matrimonyServlet")
    public String onPress(MatrimonyDTO dto)
    {
        System.out.println("onPress created");
        System.out.println(dto);
        return "Matrimony.jsp";
    }
}
