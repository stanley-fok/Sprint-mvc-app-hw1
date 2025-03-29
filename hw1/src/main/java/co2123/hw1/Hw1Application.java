package co2123.hw1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import java.util.List;
import java.util.ArrayList;


@SpringBootApplication
public class Hw1Application implements CommandLineRunner {

    public static List<Menu> menus;

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        menus = new ArrayList<>();

        Dish dish1 = new Dish();
        dish1.setName("Seafood Pizza");
        dish1.setDescription("Freshly-Baked Pizza (Standard Base Ingredients) with anchovies, vegetables and cheese Toppings");
        dish1.setDietary("Pescatarian");
        dish1.setRating(4);

        Dish dish2 = new Dish();
        dish2.setName("Quinoa Salad with Tuna");
        dish2.setDescription("Fresh Quinoa Salad Served with Cucumber, Bell Peppers, Tuna, and a Citrus Vinaigrette");
        dish2.setDietary("Gluten Free");
        dish2.setRating(5);

        Menu menu = new Menu();
        menu.setId(0);
        menu.setType("Lunch Menu");
        menu.setChef("Chef Stan");
        menu.setDishes(new ArrayList<>(List.of(dish1, dish2)));

        menus.add(menu);

    }
}
