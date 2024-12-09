package com.xworkz.song.Controller;

import com.xworkz.song.DTO.BankDTO;
import com.xworkz.song.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankController {
    @Autowired
    private BankService bankService;
    public BankController()
    {
        System.out.println("Created Bank Controller");
    }

    @RequestMapping("/register")
    public String onSave(BankDTO dto)
    {
        System.out.println("created onSave");
        System.out.println(dto);
        boolean ref=this.bankService.Validate(dto);
        if(ref)
        {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
        return "Bank.jsp";

    }
}
