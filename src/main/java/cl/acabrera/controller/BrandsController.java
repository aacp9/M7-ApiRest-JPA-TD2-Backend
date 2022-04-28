package cl.acabrera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.acabrera.DTO.BrandsDTO;
import cl.acabrera.service.BrandsService;

@RestController
@RequestMapping("api/brands/v1")
public class BrandsController {

	@Autowired
	BrandsService brandService;
	
	@GetMapping("/findAllByBrandsName")
	public ResponseEntity<List<BrandsDTO>> findAllByBrandsName(){
		try {
			List<BrandsDTO> listBrands=brandService.findByAllBrandsName();
			//consultamos valor obtenido
			if (!listBrands.isEmpty()) {
				//retornamos la lista y un estatus de ok.
				return new ResponseEntity<>(listBrands,HttpStatus.OK);
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
