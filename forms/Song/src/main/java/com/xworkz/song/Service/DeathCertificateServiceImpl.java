package com.xworkz.song.Service;

import com.xworkz.song.DTO.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements DeathCertificateService {
    public DeathCertificateServiceImpl()
    {
        System.out.println("DeathCertificateServiceImpl created");
    }
    @Override
    public boolean validate(DeathCertificateDTO dto) {
        return true;
    }



}
