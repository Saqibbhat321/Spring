package com.xworkz.forms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistrationFormDto {


    private String name;
    private String location;
    private double amount;
}
