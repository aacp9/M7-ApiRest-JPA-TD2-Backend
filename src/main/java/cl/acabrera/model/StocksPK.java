package cl.acabrera.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
@EqualsAndHashCode	//requisito para llave compuesta
@Embeddable			//requisito para llave compuesta
public class StocksPK implements Serializable {//serializable: requisito para llave compuesta

	private static final long serialVersionUID = 1L;

	@Column(name="store_id", insertable = false, updatable = false)
	protected Integer storeIdFK;

	@Column(name="product_id", insertable = false, updatable = false)
	protected Integer productIdFK;

    
}
