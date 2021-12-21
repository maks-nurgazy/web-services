package com.love2code.example.car;

import com.love2code.example.exception.CarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> listCars() {
        return carService.listCars();
    }

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable String id) {
        Car car = carService.getCar(id);
        if (car == null) {
            throw new CarNotFoundException("id : " + id);
        }

        return car;
    }

    @PostMapping("/cars")
    public ResponseEntity<Object> createCar(@RequestBody Car newCar) {
        Car car = carService.saveCar(newCar);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(car.getId()).toUri();

        return ResponseEntity.created(uri).body(car);
    }
}
