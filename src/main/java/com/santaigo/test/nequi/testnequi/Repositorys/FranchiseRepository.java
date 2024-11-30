package com.santaigo.test.nequi.testnequi.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santaigo.test.nequi.testnequi.Models.Franchise;

public interface FranchiseRepository extends JpaRepository<Franchise, Long> {
    
}
