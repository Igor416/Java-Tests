package com.example.demo.mapper;

import com.example.demo.entity.Food;
import com.example.demo.entity.Fruit;
import com.example.demo.entity.Vegetable;
import com.example.demo.response.FoodResponse;
import com.example.demo.response.FruitResponse;
import com.example.demo.response.VegetableResponse;

import org.springframework.stereotype.Component;

@Component
public class FoodMapper {
  public FoodResponse map(Food food) {
    if (food instanceof Fruit) {
      return map((Fruit)food);
    } else {
      return map((Vegetable)food);
    }
  }

  public FruitResponse map(Fruit fruit) {
    FruitResponse fruitResponse = new FruitResponse(fruit.getName(), fruit.getPrice(), fruit.isWithSeeds(), fruit.getQuantity());
    return fruitResponse;
  }

  public VegetableResponse map(Vegetable vegetable) {
    VegetableResponse vegetableResponse = new VegetableResponse(vegetable.getName(), vegetable.getPrice(), vegetable.getQuantity());
    return vegetableResponse;
  }
}
