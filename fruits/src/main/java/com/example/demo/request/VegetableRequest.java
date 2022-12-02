package com.example.demo.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class VegetableRequest extends FoodRequest {
  private int quantity;

  public VegetableRequest(String name, float price, int quantity) {
    super(name, price);
    this.quantity = quantity;
  }
}
