package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private int id;
    private String type;
    private String chef;
    private List<Dish> dishes;


    public Menu() {
        this.dishes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }


    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public void addDish(Dish dish) {
        this.dishes.add(dish);
    }

}

