package org.esercizio.dto;

import java.util.List;

public class DrinkDTO {
	
	//Variabili filtrate dal DTO
	private String name;
	private String category;
	private String type;
	private String glass;
	private String drink_image;
	private List<String> ingredients;
	
	
	//Costruttore x oggetto completo
	public DrinkDTO(String new_name, String new_category, String new_type, String new_glass, String new_image, List<String> new_ingredients) {
		this.setName(new_name);
		this.setCategory(new_category);
		this.setType(new_type);
		this.setGlass(new_glass);
		this.setDrink_image(new_image);
		this.setIngredients(new_ingredients);
	}
	
	//Costruttore x oggetto con il minimo indispensabile ( usato dal DrinkMapper per casi speciali )
	public DrinkDTO(String new_name, String new_image) {
		this.setName(new_name);
		this.setDrink_image(new_image);
	}

	
	
	//Getter e setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGlass() {
		return glass;
	}
	public void setGlass(String glass) {
		this.glass = glass;
	}
	public String getDrink_image() {
		return drink_image;
	}
	public void setDrink_image(String drink_image) {
		this.drink_image = drink_image;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	
}
