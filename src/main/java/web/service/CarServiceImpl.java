package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "X5", 2020));
        cars.add(new Car("Audi", "A6", 2019));
        cars.add(new Car("Toyota", "Camry", 2018));
        cars.add(new Car("Kia", "Rio", 2022));
        cars.add(new Car("Ford", "Focus", 2021));

        if (count <= 0) {
            return new ArrayList<>();
        }
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}