package com.love2code.example.car;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("1", "Toyota", "001Dev", new Date()));
        cars.add(new Car("2", "BMW", "002Dev", new Date()));
        cars.add(new Car("3", "Bugatti", "003Dev", new Date()));
    }

    public List<Car> listCars() {
        return cars;
    }

    public Car getCar(String id) {
        for (Car car : cars)
            if (car.getId().equals(id))
                return car;

        return null;
    }

    public Car saveCar(Car newCar) {
        newCar.setId(String.valueOf(cars.size() + 1));
        cars.add(newCar);

        return newCar;
    }

    public Car deleteCar(String id){
        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()){
            Car car = carIterator.next();

            if(car.getId().equals(id)){
                carIterator.remove();

                return car;
            }
        }

        return null;
    }
}
