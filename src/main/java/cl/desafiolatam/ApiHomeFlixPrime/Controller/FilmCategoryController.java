package cl.desafiolatam.ApiHomeFlixPrime.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.ApiHomeFlixPrime.Model.FilmCategory;
import cl.desafiolatam.ApiHomeFlixPrime.Service.FilmCategoryService;

@RestController
@RequestMapping("/api/v1/filmCategory")
public class FilmCategoryController {

	@Autowired
	private FilmCategoryService filmCategoryService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<FilmCategory> findAll(){
		return filmCategoryService.findAll();
	}
	
	@GetMapping("/{idCategory}/{title}")
	@ResponseStatus(HttpStatus.OK)
	public List<FilmCategory> findByCategoryAndTitle(@PathVariable Long idCategory, @PathVariable String title ){
		return filmCategoryService.findByCategoryAndTitle(idCategory, title);
	}
	
	@GetMapping("/{idCategory}")
	@ResponseStatus(HttpStatus.OK)
	public List<FilmCategory> findByCategoryAndTitle(@PathVariable Long idCategory ){
		return filmCategoryService.findByCategory(idCategory);
	}
}
