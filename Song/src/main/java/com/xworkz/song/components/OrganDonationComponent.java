package com.xworkz.song.components;

import com.xworkz.song.DTO.OrganDonationDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class OrganDonationComponent {
    public OrganDonationComponent()
    {
        System.out.println(("OrganDonationComponent"));
    }
    @RequestMapping("/organDonationServlet")
    public String onPress(OrganDonationDTO dto)
    {
        System.out.println("onPress created");
        System.out.println(dto);
        return "OrganDonation.jsp";
    }

}
