package org.esercizio.service;

import java.util.List;

import org.esercizio.dto.DrinkDTO;

public interface DrinkService {
	public List<DrinkDTO> findByfirstLetter(String url);
	
	
	public List<DrinkDTO> findByID(String url);
	
	
	public List<DrinkDTO> findByIngredient(String url);
	
	
	public String findImagesByID(String url);
}
