package cl.acabrera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.acabrera.DTO.BrandsDTO;
import cl.acabrera.repository.BrandsRepository;
@Service
public class BrandsServiceImpl implements BrandsService {

	@Autowired
	BrandsRepository brandRepository;
	
	@Override
	public List<BrandsDTO> findByAllBrandsName() {
		return brandRepository.findByAllBrandsName();
	}

}
