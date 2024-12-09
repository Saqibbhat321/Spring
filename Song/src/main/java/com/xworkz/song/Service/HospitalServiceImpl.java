package com.xworkz.song.Service;

import com.xworkz.song.DTO.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {
    public HospitalServiceImpl()
    {
        System.out.println("Created HospitalServiceImpl");
    }

    @Override
    public boolean validate(HospitalDTO dto) {
        return true;
    }


}
