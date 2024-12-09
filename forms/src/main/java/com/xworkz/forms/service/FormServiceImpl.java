package com.xworkz.forms.service;

import com.xworkz.forms.dtos.RegistrationFormDto;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements FormService{

    @Override
    public boolean validate(RegistrationFormDto registrationFormDto) {
        System.out.println("validating form dto");
        return true;
    }
}
