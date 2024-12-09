package com.xworkz.song.Controller;

import com.xworkz.song.DTO.DeathCertificateDTO;
import com.xworkz.song.Service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificateController {
    @Autowired
    private DeathCertificateService deathCertificateService;

    public DeathCertificateController()
    {
        System.out.println("DeathCertificateController created");
    }
    @RequestMapping("/send")
    public String save(DeathCertificateDTO dto)
    {
        System.out.println("save created");
        System.out.println("DeathCertificateService:"+dto);
        boolean ref=this.deathCertificateService.validate(dto);
        if(ref)
        {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
        return "DeathCertificate.jsp";
    }
}
