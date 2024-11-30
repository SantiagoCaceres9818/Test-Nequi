package com.santaigo.test.nequi.testnequi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santaigo.test.nequi.testnequi.Models.Office;
import com.santaigo.test.nequi.testnequi.Services.OfficeServices;

@RestController
@RequestMapping("api/{franchiseId}/office")
public class OfficeController {

    @Autowired
    private OfficeServices officeServices;

    @PostMapping
    public ResponseEntity<Office> addOffice (@PathVariable Long franchiseId, @RequestBody Office office) {
        return ResponseEntity.ok(officeServices.addOffice(franchiseId, office));
    }

    
}
