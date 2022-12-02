package com.example.demo.request;

import lombok.Data;

@Data
public abstract class FoodRequest {
  protected String name;
  protected float price;

  public FoodRequest(String name, float price) {
    this.name = name;
    this.price = price;
  }
}
