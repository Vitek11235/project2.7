package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    @RequestMapping(value = "/cars")//http://localhost:8080/cars?count=2
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count,
                           Model model) {

        model.addAttribute("carsList", new CarServiceImpl().listCars(count));
        return "cars";
    }
}