package cl.desafiolatam.ApiHomeFlixPrime.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Film;



@Repository
public interface FilmRepository  extends JpaRepository<Film,Long>{

	@Query(
			  value = "select * from film  where title like '%?1%'", 
			  nativeQuery = true)
	List<Film> findByTitle(String palabra);
	
}
