package org.esercizio.repository;

//import java.util.ArrayList;
import java.util.List;

import org.esercizio.dto.DrinkDTO;
import org.esercizio.mapper.DrinkMapper;
import org.esercizio.model.DrinkList;
//import org.esercizio.model.DrinkModel;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Visto che le api di thecocktaildb.com forniscono dati da loro non sara necessario una vera repository, 
//ma comunque preferisco dividere le operazioni di raccoglimento dati.

//Una vera repository sarebbe stata un interfaccia con i tag @Repository che utilizzando tag @Query sarebbe riuscita a prendere dati
//da un ipotetico Database

@Component
public class DrinkRepository {
	
	
	public List<DrinkDTO> findByfirstLetter(String url) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String jsonString = restTemplate.getForObject(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		DrinkList prova = mapper.readValue(jsonString, DrinkList.class);
		DrinkMapper d = new DrinkMapper();
		
		
		return d.GetAllDrinkDTO(prova.getDrinks());
	}

	
	public List<DrinkDTO> findByID(String url) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String jsonString = restTemplate.getForObject(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		DrinkList prova = mapper.readValue(jsonString, DrinkList.class);
		DrinkMapper d = new DrinkMapper();
		
		
		return d.GetAllDrinkDTO(prova.getDrinks());
	}

	
	public List<DrinkDTO> findByIngredient(String url) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String jsonString = restTemplate.getForObject(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		DrinkList prova = mapper.readValue(jsonString, DrinkList.class);
		
		
		
		
		
		/* Si potrebbe ottenere anche drink con informazioni, ma visto la quantità di ingredienti supererebbe 
		 * il massimo di richieste 
		  
		 
		List<DrinkModel> drink_con_desc = new ArrayList<>();
		String url2 = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=";
		
		
		for (DrinkModel d : prova.getDrinks()) {
		    jsonString= restTemplate.getForObject(url2+d.getIdDrink(), String.class);
		    DrinkList drink = mapper.readValue(jsonString, DrinkList.class);
			
			drink_con_desc.add(drink.getDrinks().get(0));
			
		}
		*/

		
		
		
		DrinkMapper d = new DrinkMapper();
		
		
		return d.GetAllDrinkDTO(prova.getDrinks());
	}

	public List<DrinkDTO> findImagesByID(String url) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String jsonString = restTemplate.getForObject(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		DrinkList prova = mapper.readValue(jsonString, DrinkList.class);
		DrinkMapper d = new DrinkMapper();
		
		
		return d.GetAllDrinkDTO(prova.getDrinks());
	}
}
