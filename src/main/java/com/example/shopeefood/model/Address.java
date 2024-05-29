package com.example.shopeefood.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "address")
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String phoneNumber;
    private String nameUser;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = true)
    private User user;

    public Address(Long id, String address, String phoneNumber, String nameUser) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.nameUser = nameUser;
    }

    public Address() {

    }
}
