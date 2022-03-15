package cl.desafiolatam.ApiHomeFlixPrime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.ApiHomeFlixPrime.Model.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Long>{

}
