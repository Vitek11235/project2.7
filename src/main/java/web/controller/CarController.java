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
    public String printCar(@RequestParam(value = "count", defaultValue = "5") String count,
                           Model model) {

        int c = Integer.parseInt(count);
        model.addAttribute("carsList", CarServiceImpl.carsService.listCars(c));
        return "cars";
    }
}