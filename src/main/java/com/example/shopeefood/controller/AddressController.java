package com.example.shopeefood.controller;

import com.example.shopeefood.model.Address;
import com.example.shopeefood.model.Order;
import com.example.shopeefood.model.User;
import com.example.shopeefood.repository.IAddressRepository;
import com.example.shopeefood.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    private IAddressRepository iAddressRepository;
    @Autowired
    private IUserService iUserService;
    @GetMapping({"/{idUser}"})
    private  ResponseEntity<List<Address>> showAddress(@PathVariable Long idUser){
   List<Address> addressList = iAddressRepository.findAllByUserId(idUser);
   return new ResponseEntity<>(addressList,HttpStatus.OK);
    }
    @PostMapping("/{idUser}")
    private ResponseEntity<Address> addAddress(@PathVariable Long idUser, @RequestBody Address address){
        User user = iUserService.findById(idUser).get();
        address.setUser(user);
        address= iAddressRepository.save(address);
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }
    @PutMapping()
    private ResponseEntity<Address> updateAddress( @RequestBody Address address){
        address= iAddressRepository.save(address);
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }
}
