package com.xworkz.song.components;

import com.xworkz.song.DTO.JobDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class JobComponent {
    public JobComponent()
    {
        System.out.println("JobComponent created");
    }

    @RequestMapping("/upload")
    public String onPress(JobDTO jobDTO)
    {
        System.out.println("created onPress");
        System.out.println("JobDTO :"+jobDTO);
        return "Job.jsp";
    }
}
