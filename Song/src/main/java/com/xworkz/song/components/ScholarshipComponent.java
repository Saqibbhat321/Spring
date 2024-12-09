package com.xworkz.song.components;

import com.xworkz.song.DTO.ScholarShipDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class ScholarshipComponent {
    public ScholarshipComponent()
    {
        System.out.println("ScholarshipComponent created");
    }
    @RequestMapping("/scholarshipServlet")
    public String onPress(ScholarShipDTO dto)
    {
        System.out.println("onPress Created");
        System.out.println(dto);
        return "Scholarship.jsp";
    }
}
