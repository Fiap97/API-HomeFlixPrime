package cl.desafiolatam.ApiHomeFlixPrime.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Film;
import cl.desafiolatam.ApiHomeFlixPrime.Repository.FilmRepository;


@Service
public class FilmServiceImpl implements FilmService{

	
	@Autowired
	FilmRepository filmRepository;
	
	@Override
	public Film findById(Long id) {
		return filmRepository.findById(id).get();

	}

	@Override
	public List<Film> findAll() {
		return filmRepository.findAll();

	}

	@Override
	public List<Film> findByTitle(String palabra) {
		
		return filmRepository.findByTitle(palabra);
	}

}
