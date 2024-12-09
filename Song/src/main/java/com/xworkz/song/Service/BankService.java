package com.xworkz.song.Service;

import com.xworkz.song.DTO.BankDTO;
import org.springframework.stereotype.Service;

@Service
public interface BankService {
    boolean Validate(BankDTO dto);
}
