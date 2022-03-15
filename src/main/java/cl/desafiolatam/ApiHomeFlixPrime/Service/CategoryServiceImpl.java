package cl.desafiolatam.ApiHomeFlixPrime.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Category;
import cl.desafiolatam.ApiHomeFlixPrime.Repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{


	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public Category findById(Long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

}
