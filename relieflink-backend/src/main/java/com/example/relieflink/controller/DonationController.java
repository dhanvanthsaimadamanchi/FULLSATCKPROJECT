package com.example.relieflink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.relieflink.model.Donation;
import com.example.relieflink.service.DonationService;

@RestController
@CrossOrigin(origins = "*")
public class DonationController {

    @Autowired
    private DonationService service;

    @PostMapping("/donate")
    public String donate(@RequestBody Donation d) {
        service.save(d);
        return "Saved";
    }

    @GetMapping("/donations")
    public List<Donation> getAll() {
        return service.getAll();
    }

    @PutMapping("/updateStatus")
    public String update(@RequestBody Donation d) {
        service.updateStatus(d.getId(), d.getStatus());
        return "Updated";
    }
}