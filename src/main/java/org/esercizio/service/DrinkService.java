package org.esercizio.service;

import java.util.List;

import org.esercizio.dto.DrinkDTO;

public interface DrinkService {
	//Le funzioni servono a dare forma all' implementazione dei servizi, in modo che si possano utilizzare 
	//e aiutano a dividere la logica
	
	public List<DrinkDTO> findByfirstLetter(String url);
	
	
	public List<DrinkDTO> findByID(String url);
	
	
	public List<DrinkDTO> findByIngredient(String url);
	
	
	public String findImagesByID(String url);
}
