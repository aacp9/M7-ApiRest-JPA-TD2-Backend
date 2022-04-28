package cl.acabrera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.acabrera.DTO.BrandsDTO;
import cl.acabrera.model.Brands;
@Repository
public interface BrandsRepository extends JpaRepository<Brands, Integer> {
	@Query(value="SELECT new cl.acabrera.DTO.BrandsDTO(b.brandId, b.brandName) FROM Brands b")
	public List<BrandsDTO> findByAllBrandsName();
}
