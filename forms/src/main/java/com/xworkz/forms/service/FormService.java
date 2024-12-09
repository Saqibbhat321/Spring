package com.xworkz.forms.service;

import com.xworkz.forms.dtos.RegistrationFormDto;

public interface FormService {


    boolean validate(RegistrationFormDto registrationFormDto);
}
