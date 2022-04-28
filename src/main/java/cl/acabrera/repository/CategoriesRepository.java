package cl.acabrera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.acabrera.DTO.CategoriesDTO;
import cl.acabrera.model.Categories;
@Repository
public interface CategoriesRepository  extends JpaRepository<Categories, Integer>{
	@Query(value="SELECT new cl.acabrera.DTO.CategoriesDTO(c.categoryId, c.categoryName) FROM Categories c")
	public List<CategoriesDTO> findByAllCategoriesName();
}
