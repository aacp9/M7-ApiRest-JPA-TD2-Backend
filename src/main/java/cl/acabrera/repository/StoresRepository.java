package cl.acabrera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.acabrera.DTO.StoresDTO;
import cl.acabrera.model.Stores;
@Repository
public interface StoresRepository extends JpaRepository<Stores, Integer> {
	@Query(value="SELECT new cl.acabrera.DTO.StoresDTO(s.storeId, s.storeName) FROM Stores s")
	public List<StoresDTO> findByAllStoresName();
}
