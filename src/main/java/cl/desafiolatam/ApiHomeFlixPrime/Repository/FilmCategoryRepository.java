package cl.desafiolatam.ApiHomeFlixPrime.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.ApiHomeFlixPrime.Model.FilmCategory;


@Repository
public interface FilmCategoryRepository  extends JpaRepository<FilmCategory,Long> {

	@Query(value= "SELECT fc FROM FilmCategory fc WHERE fc.category.category_id = :idCategory and fc.film.title like CONCAT('%',:title,'%')")
	List<FilmCategory> findByCategoryAndTitle(Long idCategory, String title);
	
	@Query(value= "SELECT fc FROM FilmCategory fc WHERE fc.category.category_id = :idCategory")
	List<FilmCategory> findByCategory(Long idCategory);
	
}
