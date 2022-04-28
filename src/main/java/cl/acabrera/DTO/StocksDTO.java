package cl.acabrera.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StocksDTO {
	private String storeNameDto;
	private int productIdDto;
	private String productNameDto;
	private int quantityDto;
}
