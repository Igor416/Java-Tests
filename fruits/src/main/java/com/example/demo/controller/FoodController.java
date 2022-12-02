package com.example.demo.controller;

import com.example.demo.mapper.FoodMapper;
import com.example.demo.service.FoodService;
import com.example.demo.request.FruitRequest;
import com.example.demo.request.VegetableRequest;
import com.example.demo.response.FoodResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FoodController {
  private final FoodMapper mapper;
  private final FoodService foodService;

  public FoodController(FoodMapper mapper, FoodService foodService) {
    this.mapper = mapper;
    this.foodService = foodService;
  }

  @PostMapping("/fruit")
  public FoodResponse addfood(@RequestBody FruitRequest fruitRequest) {
    return mapper.map(foodService.addFood(fruitRequest));
  }

  @PostMapping("/vegetable")
  public FoodResponse addfood(@RequestBody VegetableRequest vegetableRequest) {
    return mapper.map(foodService.addFood(vegetableRequest));
  }

  @GetMapping("/food")
  public List<FoodResponse> getfoods() {
    return foodService.getFood().stream().map(mapper::map).collect(Collectors.toList());
  }

  @PutMapping("/fruit/{id}")
  public FoodResponse updatefood(@PathVariable("id") int id, @RequestBody FruitRequest fruitRequest) {
    return mapper.map(foodService.updateFood(id, fruitRequest));
  }

  @PutMapping("/vegetable/{id}")
  public FoodResponse updatefood(@PathVariable("id") int id, @RequestBody VegetableRequest vegetableRequest) {
    return mapper.map(foodService.updateFood(id, vegetableRequest));
  }

  @GetMapping("/food/{id}")
  public FoodResponse getfood(@PathVariable("id") int id) {
    return mapper.map(foodService.getFood(id));
  }

  @DeleteMapping("/food/{id}")
  public String deletefood(@PathVariable("id") int id) throws Exception {
    return foodService.deleteFood(id);
  }
}
