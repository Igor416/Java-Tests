package com.example.demo.repository;

import com.example.demo.entity.Food;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FoodRepository {
  private final List<Food> food = new LinkedList<Food>();

  public List<Food> getFood() {
    return food;
  }

  public Food save(Food item) {
    food.add(item);
    return item;
  }

  public Food edit(int id, Food item) {
    food.set(id, item);
    return item;
  }

  public Optional<Food> findById(int id) {
    return food.stream().skip(id).findFirst();
  }

  public Optional<Food> findByName(String name) {
    return food.stream().filter(item -> item.getName() == name).findFirst();
  }

  public void delete(Food item) {
    food.remove(item);
  }
}