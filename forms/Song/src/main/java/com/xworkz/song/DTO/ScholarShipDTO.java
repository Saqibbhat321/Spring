package com.xworkz.song.DTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ScholarShipDTO {
    private String studentName;
    private String courseName;
    private double scholarshipAmount;
    private String scholarshipType;
    private String applicationDate;
}
