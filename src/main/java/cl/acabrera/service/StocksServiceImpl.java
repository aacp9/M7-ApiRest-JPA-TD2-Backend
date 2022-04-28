package cl.acabrera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.acabrera.DTO.StocksDTO;
import cl.acabrera.model.Stocks;
import cl.acabrera.repository.StocksRepository;
@Service
public class StocksServiceImpl implements StocksService {
	
	@Autowired
	StocksRepository stockRepository;
	
	@Override
	public List<Stocks> findAll() {
		return stockRepository.findAll();
	}

	@Override
	public List<StocksDTO> stocksList() {
		
		return stockRepository.stocksList();
	}

	@Override
	public List<StocksDTO> stocksListParams(Integer storeIdService, Integer categoryIdService, Integer brandIdService) {
		return stockRepository.stocksListParams(storeIdService, categoryIdService, brandIdService);
	}


}
