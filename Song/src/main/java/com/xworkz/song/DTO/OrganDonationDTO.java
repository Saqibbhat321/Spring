package com.xworkz.song.DTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrganDonationDTO {
    private String donorName;
    private String recipientName;
    private String organType;
    private int donorAge;
    private int recipientAge;
    private String donationDate;
    private String hospitalName;
    private String bloodType;
    private String contactNumber;
    private String medicalCondition;
}
