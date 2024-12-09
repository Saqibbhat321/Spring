package com.xworkz.song.Service;

import com.xworkz.song.DTO.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {
    boolean validate(PassportDTO dto);
}
