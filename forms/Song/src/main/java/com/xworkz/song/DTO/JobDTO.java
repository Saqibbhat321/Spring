package com.xworkz.song.DTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JobDTO {
    public String firstName;
    public String lastName;
    public String email;
    public Long phoneNo;
    public String jobLocation;
    public int age;
    public String currentLocation;
    public String designation;
    public String qualification;
}
