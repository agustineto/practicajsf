/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author Agustin Zavala
 *
 */
public class RestauranteService {
	
	public List<Restaurante> consultarRestaurante(){
		
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Gerente gerenteChino = new Gerente();
		Gerente gerenteMexicano = new Gerente();
		Restaurante restauranteChino = new Restaurante();
		Restaurante restauranteMexicano = new Restaurante();
		
		restauranteChino.setNombre("Oni-chan");
		restauranteChino.setDireccion("#123");
		restauranteChino.setPais("China");
		
		gerenteChino.setNombre("Vegetta");
		gerenteChino.setApellido("Vegis");
		restauranteChino.setGerente(gerenteChino);
		
		restauranteMexicano.setNombre("Bigotes");
		restauranteMexicano.setDireccion("#123");
		restauranteMexicano.setPais("Mexico");
		
		gerenteMexicano.setNombre("Gonso");
		gerenteMexicano.setApellido("Gonzalez");
		restauranteMexicano.setGerente(gerenteMexicano);
		
		restaurantes.add(restauranteMexicano);
		restaurantes.add(restauranteChino);
		
		return restaurantes;
	}

}
