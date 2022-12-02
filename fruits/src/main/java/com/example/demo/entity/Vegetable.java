package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vegetable extends Food {
  private int quantity;

  public Vegetable(String name, float price, int quantity) {
    super(name, price);
    this.quantity = quantity;
  }
}
