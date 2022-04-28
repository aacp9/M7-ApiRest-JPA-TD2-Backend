package cl.acabrera.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stocks")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Stocks {

	@EmbeddedId //requisito para llave compuesta
	private StocksPK stocksPK; //LLAVE COMPUESTA 

	private int quantity;
	
//LLAVES DERIVADAS 
	//N:1
	@ManyToOne
	@MapsId("storeIdFK")//nombre dado en clase StockPK
	@JoinColumn(name="store_id")
	private Stores store;
	
	//N:1
	@ManyToOne
	@MapsId("productIdFK")//nombre dado en clase StockPK
	@JoinColumn(name="product_id")
	private Products product; 
//FIN DE LLAVES DERIVADAS

}
