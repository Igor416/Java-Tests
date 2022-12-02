package com.example.demo.response;

import lombok.Data;

@Data
public abstract class FoodResponse {
  protected String name;
  protected float price;

  public FoodResponse(String name, float price) {
    this.name = name;
    this.price = price;
  }
}
