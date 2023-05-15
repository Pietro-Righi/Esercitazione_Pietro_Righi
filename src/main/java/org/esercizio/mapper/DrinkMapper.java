package org.esercizio.mapper;

import java.util.ArrayList;
import java.util.List;

import org.esercizio.dto.DrinkDTO;
import org.esercizio.model.DrinkModel;
import org.springframework.stereotype.Component;


@Component
public class DrinkMapper {
	public DrinkDTO toDrinkDTO(DrinkModel drink) {
		
		List<String> ingredients = new ArrayList<String>();
		ingredients.add(drink.getStrIngredient1());
		ingredients.add(drink.getStrIngredient2());
		ingredients.add(drink.getStrIngredient3());
		ingredients.add(drink.getStrIngredient4());
		ingredients.add(drink.getStrIngredient5());
		ingredients.add(drink.getStrIngredient6());
		ingredients.add(drink.getStrIngredient7());
		ingredients.add(drink.getStrIngredient8());
		ingredients.add(drink.getStrIngredient9());
		ingredients.add(drink.getStrIngredient10());
		ingredients.add(drink.getStrIngredient11());
		ingredients.add(drink.getStrIngredient12());
		ingredients.add(drink.getStrIngredient13());
		ingredients.add(drink.getStrIngredient14());
		ingredients.add(drink.getStrIngredient15());
		
		DrinkDTO drinks = null;
		
		if(drink.getStrCategory()!=null) {
			drinks = new DrinkDTO(drink.getStrDrink(), drink.getStrCategory(), drink.getStrAlcoholic(), drink.getStrGlass(), drink.getStrDrinkThumb(), ingredients);
		}
		else {
			drinks = new DrinkDTO(drink.getStrDrink(),drink.getStrDrinkThumb());
		}
		
		
		return drinks;
		
	}
	
	public List<DrinkDTO> GetAllDrinkDTO(List<DrinkModel> drinks){
		List<DrinkDTO> drinksDTO=drinks.stream().map(this::toDrinkDTO).toList();
		return drinksDTO;
	}
}
