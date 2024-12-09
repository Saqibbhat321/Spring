package com.xworkz.song.DTO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class DeathCertificateDTO {
    public String name;
    public int age;
    public String address;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    public String dob;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    public String LastDATE;
    public String causeofDeath;
}
