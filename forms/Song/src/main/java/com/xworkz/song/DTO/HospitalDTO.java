package com.xworkz.song.DTO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class HospitalDTO {
    private String patientName;
    private String email;
    private Long phoneNo;
    private int age;
    private String doctorName;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    public String appointmentDate;
}

