package com.example.relieflink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.relieflink.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}