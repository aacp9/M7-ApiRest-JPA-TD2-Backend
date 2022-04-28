package cl.acabrera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.acabrera.DTO.CategoriesDTO;
import cl.acabrera.service.CategoriesService;

@RestController
@RequestMapping("api/categories/v1")
public class CategoriesController {

	@Autowired
	CategoriesService categoriesService;
	
	@GetMapping("/findAllByCategoriesName")
	public ResponseEntity<List<CategoriesDTO>> findAllByCategoriesName(){
		try {
			List<CategoriesDTO> listCategories=categoriesService.findByAllCategoriesName();
			//consultamos valor obtenido
			if (!listCategories.isEmpty()) {
				//retornamos la lista y un estatus de ok.
				return new ResponseEntity<>(listCategories,HttpStatus.OK);
			}else {
				//retornamos un estatus de no encontrado
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// en este caso hubrá un error en el sevidor
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
