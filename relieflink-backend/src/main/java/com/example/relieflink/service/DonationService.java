package com.example.relieflink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relieflink.model.Donation;
import com.example.relieflink.repository.DonationRepository;

@Service
public class DonationService {

    @Autowired
    private DonationRepository repo;

    public Donation save(Donation d) {
        return repo.save(d);
    }

    public List<Donation> getAll() {
        return repo.findAll();
    }

    public Donation updateStatus(Long id, String status) {
        Donation d = repo.findById(id).orElseThrow();
        d.setStatus(status);
        return repo.save(d);
    }
}