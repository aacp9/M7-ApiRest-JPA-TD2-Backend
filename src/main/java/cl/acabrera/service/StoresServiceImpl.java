package cl.acabrera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.acabrera.DTO.StoresDTO;
import cl.acabrera.repository.StoresRepository;
@Service
public class StoresServiceImpl implements StoresService {

	@Autowired
	StoresRepository storesRepository;

	@Override
	public List<StoresDTO> findByAllStoresName() {
		return storesRepository.findByAllStoresName();
	}

}
