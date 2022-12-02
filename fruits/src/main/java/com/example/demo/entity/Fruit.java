package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fruit extends Food {
  private boolean withSeeds;
  private float quantity;

  public Fruit(String name, float price, boolean withSeeds, float quantity) {
    super(name, price);
    this.withSeeds = withSeeds;
    this.quantity = quantity;
  }
}
