package tacos.web;

import org.springframework.core.convert.converter.Converter;
import tacos.Ingredient;
import tacos.data.IngredientRepository;

public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String s) {
        return ingredientRepo.findById(s);
    }
}
