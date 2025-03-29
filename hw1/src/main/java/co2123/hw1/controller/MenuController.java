package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;

@Controller
public class MenuController {

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.addValidators(new MenuValidator());
    }


    @GetMapping("/menus")
    public String menu(Model model) {
        List<Menu> menus = Hw1Application.menus;
        model.addAttribute("menus", menus);
        return "menus/list";
    }


    @RequestMapping("/newMenu")
    public String MenuForm(Model model) {
        model.addAttribute("menu", new Menu());
        return "menus/form";
    }


    @PostMapping("/addMenu")
    public String addMenu(@Valid @ModelAttribute("menu") Menu menu, BindingResult result) {
        if(result.hasErrors()){
            return "menus/form";
        }


        Hw1Application.menus.add(menu);
        return "redirect:/menus";
    }

}
