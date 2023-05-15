package org.esercizio.repository;

import java.util.List;
import org.esercizio.dto.DrinkDTO;
import org.esercizio.mapper.DrinkMapper;
import org.esercizio.model.DrinkList;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Visto che le api di thecocktaildb.com forniscono dati da loro non sara necessario una vera repository, 
//ma comunque preferisco dividere le operazioni di raccoglimento dati.

//Una vera repository sarebbe stata un interfaccia con i tag @Repository che utilizzando tag @Query 
//sarebbe riuscita a prendere dati da un ipotetico Database


@Component
public class DrinkRepository {
	//
	private RestTemplate restTemplate;
	private ObjectMapper mapper;
	private DrinkList drinkList;
	private DrinkMapper drinkMapper;
	private String jsonString;
	
	public List<DrinkDTO> findByfirstLetter(String url){
		restTemplate = new RestTemplate();
		jsonString = restTemplate.getForObject(url, String.class);
		
		mapper = new ObjectMapper();
		
		try {
			drinkList = mapper.readValue(jsonString, DrinkList.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		drinkMapper = new DrinkMapper();
		
		
		return drinkMapper.GetAllDrinkDTO(drinkList.getDrinks());
	}

	
	public List<DrinkDTO> findByID(String url){
		restTemplate = new RestTemplate();
		jsonString = restTemplate.getForObject(url, String.class);
		
		mapper = new ObjectMapper();
		
		try {
			drinkList = mapper.readValue(jsonString, DrinkList.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		drinkMapper = new DrinkMapper();
		
		
		return drinkMapper.GetAllDrinkDTO(drinkList.getDrinks());
	}

	
	public List<DrinkDTO> findByIngredient(String url){
		restTemplate = new RestTemplate();
		jsonString = restTemplate.getForObject(url, String.class);
		
		mapper = new ObjectMapper();
		
		try {
			drinkList = mapper.readValue(jsonString, DrinkList.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		/* Si potrebbe ottenere anche drink con informazioni, ma visto la quantità di ingredienti supererebbe 
		 * il massimo di richieste 
		  
		 
		List<DrinkModel> drink_con_desc = new ArrayList<>();
		String url2 = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=";
		
		
		for (DrinkModel d : prova.getDrinks()) {
		    jsonString= restTemplate.getForObject(url2+d.getIdDrink(), String.class);
		    DrinkList drink = mapper.readValue(jsonString, DrinkList.class);
			
			drink_con_desc.add(drink.getDrinks().get(0));
			
		}
		
		* ed ipoteticamente la lista sarebbe drink_con_desc
		*/

		drinkMapper = new DrinkMapper();
		
		
		return drinkMapper.GetAllDrinkDTO(drinkList.getDrinks());
	}

	public List<DrinkDTO> findImagesByID(String url) {
		restTemplate = new RestTemplate();
		jsonString = restTemplate.getForObject(url, String.class);
		
		mapper = new ObjectMapper();
		
		try {
			drinkList = mapper.readValue(jsonString, DrinkList.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		drinkMapper = new DrinkMapper();
		
		
		return drinkMapper.GetAllDrinkDTO(drinkList.getDrinks());
	}
}
