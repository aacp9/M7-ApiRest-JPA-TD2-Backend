package cl.acabrera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.acabrera.DTO.StocksDTO;
import cl.acabrera.model.Stocks;
import cl.acabrera.model.StocksPK;
@Repository
public interface StocksRepository extends JpaRepository<Stocks, StocksPK> {
	//save
	//findAll
	//findById
	//findAllById
	//delete
	
	@Query(value="SELECT new cl.acabrera.DTO.StocksDTO(stor.storeName, prod.productId, prod.productName, stoc.quantity)"
			+ "FROM Stocks stoc JOIN stoc.store stor "
			+ "JOIN stoc.product prod "
			+ "WHERE stor.storeId=1 "
			+ "AND prod.category.categoryId=5 "
			+ "AND prod.brand.brandId=9"
			)
	public List<StocksDTO> stocksList();

	@Query(value="SELECT new cl.acabrera.DTO.StocksDTO(stor.storeName, prod.productId, prod.productName, stoc.quantity)"
			+ "FROM Stocks stoc JOIN stoc.store stor "
			+ "JOIN stoc.product prod "
			+ "WHERE stor.storeId=:storeIdReceived "
			+ "AND prod.category.categoryId=:categoryIdReceived "
			+ "AND prod.brand.brandId=:brandIdReceived"
			)
	public List<StocksDTO> stocksListParams(@Param("storeIdReceived") Integer storeIdRepository, @Param("categoryIdReceived") Integer categoryIdRepository, @Param("brandIdReceived") Integer brandIdRepository);



}
