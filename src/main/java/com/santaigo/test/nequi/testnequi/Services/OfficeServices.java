package com.santaigo.test.nequi.testnequi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santaigo.test.nequi.testnequi.Models.Franchise;
import com.santaigo.test.nequi.testnequi.Models.Office;
import com.santaigo.test.nequi.testnequi.Repositorys.FranchiseRepository;
import com.santaigo.test.nequi.testnequi.Repositorys.OfficeRepository;

@Service
public class OfficeServices {
    
    @Autowired
    private OfficeRepository officeRepository;

    @Autowired
    private FranchiseRepository franchiseRepository;

    public Office addOffice (Long id, Office office) {
        Franchise franchise = franchiseRepository.findById(id).orElse(null);
        if (franchise != null) {
            office.setFranchise(franchise);
            return officeRepository.save(office);
        }
        return null;
    }
}
