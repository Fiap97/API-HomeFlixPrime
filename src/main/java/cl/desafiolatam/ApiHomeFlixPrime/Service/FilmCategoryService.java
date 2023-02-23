package cl.desafiolatam.ApiHomeFlixPrime.Service;

import java.util.List;


import cl.desafiolatam.ApiHomeFlixPrime.Model.FilmCategory;


public interface FilmCategoryService {
	
	public FilmCategory findById(Long id);
	public List<FilmCategory> findAll(); 
	public List<FilmCategory> findByCategoryAndTitle(Long id, String title);
	public  List<FilmCategory> findByCategory(Long idCategory);
}
