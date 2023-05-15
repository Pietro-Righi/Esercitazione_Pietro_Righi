package org.esercizio.controller;


import java.util.List;

import org.esercizio.dto.DrinkDTO;
import org.esercizio.model.Drink;
import org.esercizio.repository.DrinkRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;



@RestController
@RequestMapping("/param")
public class ControllerEsercizio {
		private String name;
		private String url;
	
		@PostMapping("/findByfirstLetter")
		public List<DrinkDTO> findByfirstLetter(@RequestBody Drink drink) throws JsonMappingException, JsonProcessingException{
			name = drink.name;
			url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?f="+ name;
			
			DrinkRepository repo = new DrinkRepository();
			System.out.print(url);
			
			List<DrinkDTO> drinksDTO=repo.findByfirstLetter(url);
			
			
			
		    return drinksDTO;
		}
		
		
		@PostMapping("/findByID")
		public List<DrinkDTO> findByID(@RequestBody Drink drink) throws JsonMappingException, JsonProcessingException{
			name = drink.name;
			url = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+ name;
			DrinkRepository repo = new DrinkRepository();
			System.out.print(url);
			
			List<DrinkDTO> drinksDTO=repo.findByID(url);
			
			
			return drinksDTO;
		}
		
		
		@PostMapping("/findByIngredient")
		public List<DrinkDTO> findByIngredient(@RequestBody Drink drink) throws JsonMappingException, JsonProcessingException{
			
			name = drink.name;
			url = "https://www.thecocktaildb.com/api/json/v1/1/filter.php?i="+ name;
			DrinkRepository repo = new DrinkRepository();
			System.out.print(url);
			
			List<DrinkDTO> drinksDTO=repo.findByIngredient(url);
			
			
			return drinksDTO;
		}
		
		
		@PostMapping("/findImageByID")
		public String findImagesByID(@RequestBody Drink drink) throws JsonMappingException, JsonProcessingException{
			name = drink.name;
			url = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+ name;
			DrinkRepository repo = new DrinkRepository();
			System.out.print(url);
			
			List<DrinkDTO> drinksDTO=repo.findByIngredient(url);
			
			
			return "Ecco un immaggine del drink selezionato"+drinksDTO.get(0).getDrink_image();
		}
}
