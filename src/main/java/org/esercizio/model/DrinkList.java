package org.esercizio.model;

import java.util.List;

public class DrinkList {
	
	//La classe è una soluzione al problema della funzione getFromObject() della classe RestTemplate
	// che non accetta come tipo di risultato una lista tipizzata, quindi si crea una classe wrapper
	private List<DrinkModel> drinks;

	
	
	
	//Getter e setter
	public List<DrinkModel> getDrinks() {
		return drinks;
	}

	public void setDrinks(List<DrinkModel> drinks) {
		this.drinks = drinks;
	}
}
