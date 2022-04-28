package cl.acabrera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.acabrera.DTO.StoresDTO;
import cl.acabrera.service.StoresService;

@RestController
@RequestMapping("api/stores/v1")
public class StoresController {

	@Autowired
	StoresService storeService;
	
	@GetMapping("/findAllByStoresName")
	public ResponseEntity<List<StoresDTO>> findAllByStoresName(){
		try {
			List<StoresDTO> listStores=storeService.findByAllStoresName();
			//consultamos valor obtenido
			if (!listStores.isEmpty()) {
				//retornamos la lista y un estatus de ok.
				return new ResponseEntity<>(listStores,HttpStatus.OK);
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
