package org.esercizio.mapper;

import java.util.ArrayList;
import java.util.List;
import org.esercizio.dto.DrinkDTO;
import org.esercizio.model.DrinkModel;
import org.springframework.stereotype.Component;


@Component
public class DrinkMapper {
	
	
	// Processa un oggetto per volta e lo traduce in Drink DTO
	public DrinkDTO toDrinkDTO(DrinkModel drink) {
		
		DrinkDTO drinks = null;
		
		// Se viene processato dal servizio findByIngredient avrà meno informazioni perchè il carico del json è alto
		// e di base non avrà una categoria ma solo nome e link immaggine
		if(drink.getStrCategory()!=null) {
			List<String> ingredients = new ArrayList<>();
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
			
			drinks = new DrinkDTO(drink.getStrDrink(), drink.getStrCategory(), drink.getStrAlcoholic(), drink.getStrGlass(), drink.getStrDrinkThumb(), ingredients);
		}
		else {
			drinks = new DrinkDTO(drink.getStrDrink(),drink.getStrDrinkThumb());
		}
		
		
		return drinks;
		
	}
	
	
	
	// Processa una lista di oggetti Drink e li traduce in DrinkDTO
	public List<DrinkDTO> GetAllDrinkDTO(List<DrinkModel> drinks){
		
		// Utilizzando la lista drinks si crea una copia drinksDTO mappando ogni elemento
		// e successivamente tramutarlo in DrinkDTO utilizzando la classe interna al mapper
		// e finalmente ottenendo la lista tramite il metodo .toList() ( lista del tipo List<DrinkDTO>)
		return drinks.stream().map(this::toDrinkDTO).toList();
	}
}
