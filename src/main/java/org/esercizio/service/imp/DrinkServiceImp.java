package org.esercizio.service.imp;

import java.util.List;
import org.esercizio.dto.DrinkDTO;
import org.esercizio.repository.DrinkRepository;
import org.esercizio.service.DrinkService;


public class DrinkServiceImp implements DrinkService{
	//
	private DrinkRepository repo;
	private List<DrinkDTO> drinksDTO = null;
	
	//Implementazione e sviluppo dei servizi
	
	@Override
	public List<DrinkDTO> findByfirstLetter(String url) {
		//System.out.print("Il link e "+url+"\n");
		repo = new DrinkRepository();
		
		
		drinksDTO=repo.findByfirstLetter(url);
		
		
		return drinksDTO;
	}

	@Override
	public List<DrinkDTO> findByID(String url) {
		//System.out.print("Il link e "+url+"\n");
		
		repo = new DrinkRepository();
		
		drinksDTO = repo.findByID(url);
	
		
		return drinksDTO;
	}

	@Override
	public List<DrinkDTO> findByIngredient(String url) {
		//System.out.print("Il link e "+url+"\n");
		
		repo = new DrinkRepository();
		
		drinksDTO = repo.findByIngredient(url);
		
		
		return drinksDTO;
	}

	@Override
	public String findImagesByID(String url) {
		//System.out.print("Il link e "+url+"\n");
		
		repo = new DrinkRepository();
		
		
		drinksDTO = repo.findImagesByID(url);
		
		return "Ecco un immagine del drink selezionato <"+drinksDTO.get(0).getName()+"> :"+drinksDTO.get(0).getDrink_image();
	}

}
