package com.xworkz.song.Service;

import com.xworkz.song.DTO.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public interface HospitalService {
    boolean validate(HospitalDTO dto);
}
