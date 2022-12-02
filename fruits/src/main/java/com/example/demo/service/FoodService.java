package com.example.demo.service;

import com.example.demo.repository.FoodRepository;
import com.example.demo.entity.Food;
import com.example.demo.entity.Fruit;
import com.example.demo.entity.Vegetable;
import com.example.demo.request.FruitRequest;
import com.example.demo.request.VegetableRequest;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
  private final FoodRepository FoodRepository;

  public FoodService(FoodRepository foodRepository) {
    this.FoodRepository = foodRepository;
  }

  public Food addFood(FruitRequest fruitRequest) {
    Fruit fruit = new Fruit(fruitRequest.getName(), fruitRequest.getPrice(), fruitRequest.isWithSeeds(), fruitRequest.getQuantity());
    FoodRepository.save(fruit);
    return fruit;
  }

  public Food addFood(VegetableRequest vegetableRequest) {
    Vegetable vegetable = new Vegetable(vegetableRequest.getName(), vegetableRequest.getPrice(), vegetableRequest.getQuantity());
      FoodRepository.save(vegetable);
      return vegetable;
  }

  public Fruit updateFood(int id, FruitRequest fruitRequest) {
    Optional<Food> food = FoodRepository.findById(id);

    if (food.isPresent()) {
      Fruit fruit = new Fruit(fruitRequest.getName(), fruitRequest.getPrice(), fruitRequest.isWithSeeds(), fruitRequest.getQuantity());
      FoodRepository.edit(id, fruit);
      return fruit;
    }
    return null;
  }

  public Vegetable updateFood(int id, VegetableRequest vegetableRequest) {
    Optional<Food> food = FoodRepository.findById(id);

    if (food.isPresent()) {
      Vegetable vegetable = new Vegetable(vegetableRequest.getName(), vegetableRequest.getPrice(), vegetableRequest.getQuantity());
      FoodRepository.edit(id, vegetable);
      return vegetable;
    }
    return null;
  }

  public List<Food> getFood() {
    return FoodRepository.getFood();
  }

  public Food getFood(int id) {
    Optional<Food> food = FoodRepository.findById(id);
    return food.orElseGet(null);
  }

  public Food getFood(String name) {
    Optional<Food> food = FoodRepository.findByName(name);
    return food.orElseGet(null);
  }

  public List<Food> getFoods() {
    List<Food> Foods = FoodRepository.getFood();
    return Foods;
  }

  public String deleteFood(int id) {
    Optional<Food> Food = FoodRepository.findById(id);
    if (Food.isPresent()) {
      FoodRepository.delete(Food.get());
      return "Food was deleted successfully";
    }
    return "Food was not found";
  }
}
