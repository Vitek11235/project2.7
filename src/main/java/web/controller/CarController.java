package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @RequestMapping(value = "/cars")//http://localhost:8080/cars?count=2
    public String printCar(HttpServletRequest request,
                           @RequestParam(value = "count", defaultValue = "5") String count,
                           Model model) {
        CarService carsService = new CarServiceImpl();
        Car carOne = new Car("Lada", 12);
        Car carTwo = new Car("Audi", 10);
        Car carThree = new Car("Ford", 9);
        Car carFour = new Car("Opel", 99);
        Car carFive = new Car("Nissan", 3);
        carsService.add(carOne);
        carsService.add(carTwo);
        carsService.add(carThree);
        carsService.add(carFour);
        carsService.add(carFive);

        int c = Integer.parseInt(count);
        model.addAttribute("carsList", carsService.listCars(c));
        return "cars";
    }
}