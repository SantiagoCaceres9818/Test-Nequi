package com.santaigo.test.nequi.testnequi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santaigo.test.nequi.testnequi.Models.Franchise;
import com.santaigo.test.nequi.testnequi.Services.FranchiseServices;

@RestController
@RequestMapping("/api/franchise")
public class FranchiseController {
    
    @Autowired
    private FranchiseServices franchiseServices;

    @PostMapping
    public Franchise addFrachise (@RequestBody Franchise franchise) {
        return franchiseServices.addFranchise(franchise);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Franchise> updateName (@PathVariable Long id, @RequestParam String name) {
        return ResponseEntity.ok(franchiseServices.updateNameFranchise(id, name));
    }
}
