package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.ServisCars;

@Controller
@RequestMapping("/indexCars")
public class CarController {

    @Autowired
    private ServisCars servisCars;

    @GetMapping
    public String getCarList(@RequestParam(value = "count", defaultValue = "5")int count,
                             Model model) {
        model.addAttribute("car", servisCars.getCarCount(count));
        return "indexCars";
    }
}
