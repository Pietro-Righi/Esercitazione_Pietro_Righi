package org.esercizio.controller;


import java.util.List;

import org.esercizio.dto.DrinkDTO;
import org.esercizio.model.Drink;
import org.esercizio.service.imp.DrinkServiceImp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/param")
public class ControllerEsercizio {
	
		private String url;
		private DrinkServiceImp service;
		
		
		/* Per provare funziona sia una lettera maiuscola che minuscola */
		@PostMapping("/findByfirstLetter")
		public List<DrinkDTO> findByfirstLetter(@RequestBody Drink drink){
			
			url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?f="+ drink.getName();
			
			service = new DrinkServiceImp();
			
		    return service.findByfirstLetter(url);
		}
		
		
		
		/* ID x provare funzione findByID
		 * 17222
		 * 15853
		 * 17185
		 * 17187
		 * 12668
		 * 178352
		 * 
		 * */
		@PostMapping("/findByID")
		public List<DrinkDTO> findByID(@RequestBody Drink drink){
			url = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+ drink.getName();
			
			
			service = new DrinkServiceImp();
			
		    return service.findByfirstLetter(url);
		}
		
		
		
		/*Gli ingredienti sono in inglese, qui sono sono elencati alcuni per delle prove
		 * Vodka
		 * Gin
		 * Apricot Brandy
		 * Orange Juice
		 * Lime Juice
		 * Coconut Liqueur
		 * */
		@PostMapping("/findByIngredient")
		public List<DrinkDTO> findByIngredient(@RequestBody Drink drink){
			url = "https://www.thecocktaildb.com/api/json/v1/1/filter.php?i="+ drink.getName();
			
			service = new DrinkServiceImp();
			
		    return service.findByIngredient(url);
		}
		
		
		/*ID x effettuare prove, la funzione fornisce un link all' immaggine del prodotto
		 * 17253
		 * 17258
		 * 16031
		 * 15328
		 * 12474 Waikiki Beachcomber
		 * 17219
		 * */
		@PostMapping("/findImageByID")
		public String findImagesByID(@RequestBody Drink drink){
			url = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+ drink.getName();
			
			service = new DrinkServiceImp();
			
		    return service.findImagesByID(url);
		}
}
