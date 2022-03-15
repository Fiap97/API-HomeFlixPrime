package cl.desafiolatam.ApiHomeFlixPrime.Service;

import java.util.List;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Film;


public interface FilmService {

	
	public Film findById(Long id);
	public List<Film> findAll(); 
	public List<Film> findByTitle(String palabra); 
}
