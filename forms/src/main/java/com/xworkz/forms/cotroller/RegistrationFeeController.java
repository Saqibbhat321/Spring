package com.xworkz.forms.cotroller;

import com.xworkz.forms.dtos.FriendshipFormDto;
import com.xworkz.forms.dtos.RegistrationFormDto;
import com.xworkz.forms.service.FormService;
import com.xworkz.forms.service.FriendshipFormService;
import com.xworkz.forms.service.FriendshipFormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RegistrationFeeController {

    @Autowired
    private FormService formService;
    @Autowired
    private FriendshipFormService friendshipFormService;

    public RegistrationFeeController() {
        System.out.println("registration component");
    }

    @RequestMapping("/press")
    public String pressing() {
        RegistrationFormDto registrationFormDto = new RegistrationFormDto();
        boolean ref = formService.validate(registrationFormDto);
        if (ref) {
            System.out.println("save");
        } else {
            System.out.println("not saved");
        }
        System.out.println("pressig action");
        return "index.jsp";
    }

    @RequestMapping("/send")
    public String dabao() {
        FriendshipFormDto friendshipFormDto = new FriendshipFormDto();
        boolean sent = friendshipFormService.validate(friendshipFormDto);
        if (sent) {
            System.out.println("friendship form sent");
        } else {
            System.out.println("friend form not sent!! Try Again>>>");
        }
        System.out.println("sending Request");

        return "FriendshipForm.jsp";
    }
}
