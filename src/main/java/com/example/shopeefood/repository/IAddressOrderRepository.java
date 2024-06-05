package com.example.shopeefood.repository;

import com.example.shopeefood.model.Address;
import com.example.shopeefood.model.AddressOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressOrderRepository extends JpaRepository<AddressOrder,Long> {

}
