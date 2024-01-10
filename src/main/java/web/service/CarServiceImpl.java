package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    public static List<Car> cars = new ArrayList<>();

    static {
        Car carOne = new Car("Lada", 12);
        Car carTwo = new Car("Audi", 10);
        Car carThree = new Car("Ford", 9);
        Car carFour = new Car("Opel", 99);
        Car carFive = new Car("Nissan", 3);
        cars.add(carOne);
        cars.add(carTwo);
        cars.add(carThree);
        cars.add(carFour);
        cars.add(carFive);
    }
    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listCars(int count) {
        return count >= 5 ? cars : cars.stream().limit(count).collect(Collectors.toList());
//        if (count >= 5 || count <= 0) {
//            return cars;
//        } else {
//            return cars.subList(0, count);
//        }
    }
}