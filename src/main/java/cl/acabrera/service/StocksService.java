package cl.acabrera.service;

import java.util.List;

import cl.acabrera.DTO.StocksDTO;
import cl.acabrera.model.Stocks;

public interface StocksService {

	public List<Stocks> findAll();

	public List<StocksDTO> stocksList();	
	
	public List<StocksDTO> stocksListParams(Integer storeIdService, Integer categoryIdService, Integer brandIdService);

}
