package org.esercizio.model;

public class Drink {
	

	//La classe è una soluzione per ottenere i dati di metodi POST del controller, visto che i dati json sono salvati a loro volta 
	//in un oggetto, si passa un contenitore simile per raccogliere il dato
	
	private String name;

	
	
	//Getter e Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
