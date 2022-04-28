package cl.acabrera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.acabrera.DTO.CategoriesDTO;
import cl.acabrera.repository.CategoriesRepository;
@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Override
	public List<CategoriesDTO> findByAllCategoriesName() {
		return categoriesRepository.findByAllCategoriesName();
	}

}
