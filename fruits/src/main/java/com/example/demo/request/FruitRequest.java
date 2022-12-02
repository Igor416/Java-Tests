package com.example.demo.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class FruitRequest extends FoodRequest {
  private boolean withSeeds;
  private float quantity;

  public FruitRequest(String name, float price, boolean withSeeds, float quantity) {
    super(name, price);
    this.withSeeds = withSeeds;
    this.quantity = quantity;
  }
}
