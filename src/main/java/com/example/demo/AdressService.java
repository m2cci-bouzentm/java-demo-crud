package com.example.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AddressRepository;

@Service
public class AdressService {

  // private Map<String, Address> addresses = new HashMap<>();

  @Autowired
  AddressRepository addrRepo;

  public Address create(Address address) {
    // if (address.getId().isEmpty()) {
    // long id = UUID.randomUUID().toString();
    // address.setId(id);
    // }

    // addresses.put(address.getId(), address);
    // return address;
    return addrRepo.save(address);
  }

  public List<Address> getAllAdresses() {
    // return (new ArrayList<Address>(addresses.values()));
    return addrRepo.findAll();
  }

  public Address update(Address newAdr) {
    // for (Address adr : getAllAdresses()) {
    // if (newAdr.getId().equals(adr.getId())) {
    // adr.setEmail(newAdr.getEmail());
    // adr.setUsername(newAdr.getUsername());
    // adr.setPassword(newAdr.getPassword());
    // }
    // }
    // return getAllAdresses();
    return addrRepo.save(newAdr);
  }

  public void deleteAddress(long id) {
    // return addresses.remove(id);
    addrRepo.deleteById(id);
  }
}
