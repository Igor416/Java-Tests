package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Food {
  protected String name;
  protected float price;

  public Food(String name, float price) {
    this.name = name;
    this.price = price;
  }
}
