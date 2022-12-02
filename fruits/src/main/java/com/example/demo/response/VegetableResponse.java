package com.example.demo.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class VegetableResponse extends FoodResponse {
  private int quantity;

  public VegetableResponse(String name, float price, int quantity) {
    super(name, price);
    this.quantity = quantity;
  }
}
