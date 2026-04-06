package com.example.relieflink.model;

import jakarta.persistence.*;

@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String item;
    private int qty;
    private String category;
    private String status;
    private String dateAdded;

    public Donation() {}

    public Long getId() { return id; }
    public String getItem() { return item; }
    public int getQty() { return qty; }
    public String getCategory() { return category; }
    public String getStatus() { return status; }
    public String getDateAdded() { return dateAdded; }

    public void setId(Long id) { this.id = id; }
    public void setItem(String item) { this.item = item; }
    public void setQty(int qty) { this.qty = qty; }
    public void setCategory(String category) { this.category = category; }
    public void setStatus(String status) { this.status = status; }
    public void setDateAdded(String dateAdded) { this.dateAdded = dateAdded; }
}