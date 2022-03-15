package cl.desafiolatam.ApiHomeFlixPrime.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Film;
import cl.desafiolatam.ApiHomeFlixPrime.Service.FilmService;

@RestController
@RequestMapping("/api/v1/film")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Film findById(@PathVariable Long id) {
		return filmService.findById(id);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Film> findAll(){
		return filmService.findAll();
	}
	@GetMapping("/tilte")
	@ResponseStatus(HttpStatus.OK)
	public List<Film> findByTitle(String palabra){
		return filmService.findByTitle(palabra);
	}
}
