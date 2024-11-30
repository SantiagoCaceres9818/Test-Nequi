package com.santaigo.test.nequi.testnequi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santaigo.test.nequi.testnequi.Models.Franchise;
import com.santaigo.test.nequi.testnequi.Repositorys.FranchiseRepository;

@Service
public class FranchiseServices {
    
    @Autowired
    private FranchiseRepository franchiseRepository;

    public Franchise addFranchise (Franchise franchise) {
        return franchiseRepository.save(franchise);
    }

    public Franchise updateNameFranchise (Long id, String name) {
        Franchise franchise = franchiseRepository.findById(id)
        .orElse(null);
        if (franchise != null) {
            franchise.setName(name);
            return franchiseRepository.save(franchise);
        }
        return null;
    }
}
