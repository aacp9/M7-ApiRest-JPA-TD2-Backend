package cl.acabrera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.acabrera.DTO.StocksDTO;
import cl.acabrera.model.Stocks;
import cl.acabrera.service.StocksService;

@RestController
@RequestMapping("api/response/stocks/v1")
public class StocksController {
	
	@Autowired
	StocksService stocksService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Stocks>> findAll(){
		try {
			List<Stocks> listStocks=stocksService.findAll();
			//consultamos valor obtenido
			if (!listStocks.isEmpty()) {
				//retornamos la lista y un estatus de ok.
				return new ResponseEntity<>(listStocks,HttpStatus.OK);
			}else {
				//retornamos un estatus de no encontrado
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// en este caso hubrá un error en el sevidor
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@GetMapping("/stockList")
	public ResponseEntity<List<StocksDTO>> stocksList(){
		try {
			List<StocksDTO> listStocks=stocksService.stocksList();
			//consultamos valor obtenido
			if (!listStocks.isEmpty()) {
				//retornamos la lista y un estatus de ok.
				return new ResponseEntity<>(listStocks,HttpStatus.OK);
			}else {
				//retornamos un estatus de no encontrado
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// en este caso hubrá un error en el sevidor
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/stockListParams")
	public ResponseEntity<List<StocksDTO>> stocksListParams(@RequestParam Integer storeIdController, @RequestParam Integer categoryIdController, @RequestParam Integer brandIdController){
		try {
			List<StocksDTO> listStocks=stocksService.stocksListParams(storeIdController, categoryIdController, brandIdController);
			//consultamos valor obtenido
			if (!listStocks.isEmpty()) {
				//retornamos la lista y un estatus de ok.
				return new ResponseEntity<>(listStocks,HttpStatus.OK);
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
