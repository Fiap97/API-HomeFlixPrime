package cl.desafiolatam.ApiHomeFlixPrime.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Category;
import cl.desafiolatam.ApiHomeFlixPrime.Service.CategoryService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

	
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Category findById(@PathVariable Long id) {
		return categoryService.findById(id);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Category> findAll(){
		return categoryService.findAll();
	}
}
