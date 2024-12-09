package com.xworkz.forms.service;

import com.xworkz.forms.dtos.FriendshipFormDto;
import org.springframework.stereotype.Service;

@Service
public class FriendshipFormServiceImpl implements FriendshipFormService{
    @Override
    public boolean validate(FriendshipFormDto friendshipFormDto) {
        System.out.println("validating friendhip details");
        return true;
    }
}
