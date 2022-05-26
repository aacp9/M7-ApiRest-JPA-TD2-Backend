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
public class OrderItemsPK implements Serializable{//serializable: requisito para llave compuesta
	
	private static final long serialVersionUID = 1L;

	//LLAVE COMPUESTA con una llave foranea (FK)
	
	@Column(name="order_id", insertable = false, updatable = false)
	protected Integer orderIdFK; //FK ya que es una llave foranea.
	
	@Column(name="item_id", insertable = false, updatable = false)
	protected Integer itemId; //sin FK ya que es una llave propia de la tabla order_items
}
