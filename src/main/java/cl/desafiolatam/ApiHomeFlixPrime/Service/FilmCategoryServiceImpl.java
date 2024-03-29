package cl.desafiolatam.ApiHomeFlixPrime.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.ApiHomeFlixPrime.Model.FilmCategory;
import cl.desafiolatam.ApiHomeFlixPrime.Repository.FilmCategoryRepository;


@Service
public class FilmCategoryServiceImpl implements FilmCategoryService{

	
	@Autowired
	FilmCategoryRepository filmCategoryRepository;
	
	
	@Override
	public FilmCategory findById(Long id) {
		return filmCategoryRepository.findById(id).get();

	}

	@Override
	public List<FilmCategory> findAll() {
		return filmCategoryRepository.findAll();

	}

	@Override
	public List<FilmCategory> findByCategoryAndTitle(Long idCategory, String title) {
		return filmCategoryRepository.findByCategoryAndTitle(idCategory, title.toUpperCase());
	}

	@Override
	public List<FilmCategory> findByCategory(Long idCategory) {
		return filmCategoryRepository.findByCategory(idCategory);
	}

}
