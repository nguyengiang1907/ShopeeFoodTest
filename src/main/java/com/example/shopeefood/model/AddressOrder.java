package com.example.shopeefood.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "addressOrder")
@Entity
@Data
public class AddressOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int status;
    private String address;
    private String phoneNumber;
    private String nameUser;

    public AddressOrder(Long id, int status, String address, String phoneNumber, String nameUser) {
        this.id = id;
        this.status = status;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.nameUser = nameUser;
    }

    public AddressOrder(String phoneNumber, String address, String nameUser) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.nameUser = nameUser;
    }

    public AddressOrder() {
    }
}