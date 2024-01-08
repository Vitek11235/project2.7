package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= 5 || count <= 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}