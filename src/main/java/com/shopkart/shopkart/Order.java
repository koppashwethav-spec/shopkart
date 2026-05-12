package com.shopkart.shopkart;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String address;
    private String productNames;
    private double totalAmount;
    private String status;
    private LocalDateTime orderDate;

    @PrePersist
    public void prePersist() {
        orderDate = LocalDateTime.now();
        if (status == null) status = "PENDING";
    }
}