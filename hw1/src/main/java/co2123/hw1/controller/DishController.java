package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;



@Controller
public class DishController {

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.addValidators(new DishValidator());
    }


    @GetMapping("/dishes")
    public String dish(@RequestParam("menu") int menuId, Model model) {

        Menu menu = null;
        for (Menu m : Hw1Application.menus) {
            if (m.getId() == menuId) {
                menu = m;
                break;
            }
        }

        if (menu != null) {
            model.addAttribute("dishes", menu.getDishes());
            model.addAttribute("menuId", menuId);
            return "dishes/list";
        } else {
            return "redirect:/menus";
        }
    }


    @RequestMapping("/newDish")
    public String DishForm(@RequestParam("menu") int menuId, Model model) {
        model.addAttribute("dish", new Dish());
        model.addAttribute("menuId", menuId);
        return "dishes/form";
    }


    @PostMapping("/addDish")
    public String addDish(@Valid @ModelAttribute("dish") Dish dish, BindingResult result, @RequestParam("menu") int menuId, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("menuId", menuId);
            return "dishes/form";
        }

        Menu menu = null;
        for (Menu m : Hw1Application.menus) {
            if (m.getId() == menuId) {
                menu = m;
                break;
            }
        }

        if (menu != null) {
            menu.getDishes().add(dish);
        }

        return "redirect:/menus";
    }
}