package com.example.demo.entity;

import lombok.Data;

/**
 * @author arwen
 */
@Data
public class City {

  private Long id;
  private String name;
  private String state;
  private String country;
  @Override
  public String toString() {
    return getId() + "," + getName() + "," + getState() + "," + getCountry();
  }

}