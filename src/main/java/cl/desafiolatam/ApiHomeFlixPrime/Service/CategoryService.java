package cl.desafiolatam.ApiHomeFlixPrime.Service;

import java.util.List;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Category;


public interface CategoryService {


	public Category findById(Long id);
	public List<Category> findAll(); 
	
}
