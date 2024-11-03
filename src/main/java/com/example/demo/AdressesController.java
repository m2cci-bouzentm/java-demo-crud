package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/")
public class AdressesController {

  @Autowired // auto wire the AdressService class here
  private AdressService adressService;

  @GetMapping
  public List<Address> getIndex(@RequestParam(required = false) String _param) {


    return adressService.getAllAdresses();
  }

  @PostMapping
  public Address createAddresses(@RequestBody Address address) {
    return adressService.create(address);
  }

  @PutMapping
  public Address updateAdress(@RequestBody Address newAdr) {
    return adressService.update(newAdr);
  }

  @DeleteMapping
  public void delete(@RequestParam long adrId) {
    adressService.deleteAddress(adrId);
  }

}
