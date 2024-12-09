package com.xworkz.forms.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FriendshipFormDto {

    private String name;
    private int age;
    private boolean adult;
    private float height;
}
