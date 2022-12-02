package com.example.demo.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class FruitResponse extends FoodResponse {
  private boolean withSeeds;
  private float quantity;

  public FruitResponse(String name, float price, boolean withSeeds, float quantity) {
    super(name, price);
    this.withSeeds = withSeeds;
    this.quantity = quantity;
  }
}
