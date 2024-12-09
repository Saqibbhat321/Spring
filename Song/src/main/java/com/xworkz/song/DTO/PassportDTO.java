package com.xworkz.song.DTO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class PassportDTO {
    private String passportOffice;
    private String givenName;
    private String surname;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private String dob;
    private String email;
    private String loginIdChoice;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;
}

