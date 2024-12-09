package com.xworkz.song.Service;

import com.xworkz.song.DTO.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public interface DeathCertificateService {
    boolean validate(DeathCertificateDTO dto);
    }

