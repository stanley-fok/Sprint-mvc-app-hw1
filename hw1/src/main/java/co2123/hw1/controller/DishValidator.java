package co2123.hw1.controller;

import co2123.hw1.domain.Dish;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.List;

public class DishValidator implements Validator {

    private static final List<String> DietaryOptions = List.of("Pescatarian", "Gluten Free", "Allergen Free");

    @Override
    public boolean supports(Class<?> clazz) {
        return Dish.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Dish d = (Dish) target;


        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Name is required.");


        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "", "Description is required.");


        if (!DietaryOptions.contains(d.getDietary())) {
            errors.rejectValue("dietary", "", "Dietary must be one of the following: " + DietaryOptions);
        }

        if (d.getRating() < 1 || d.getRating() > 10) {
            errors.rejectValue("rating", "", "Rating must be between 1 and 10.");
        }
    }
}
