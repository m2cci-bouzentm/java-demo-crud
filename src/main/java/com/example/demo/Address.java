package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String username;
  private String email;
  private String password;


  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }
  
}
