package cl.acabrera.model;

import javax.persistence.Column;
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
@Table(name="order_items")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class OrderItems {
	
	@EmbeddedId //requisito para llave compuesta	
	private OrderItemsPK orderItemsPK; //LLAVE COMPUESTA
	
	private int quantity;
	
	@Column(name="list_price")
	private int listPrice;
	
	private int discount;
	
	//n:1 Relación con clase Orders
	@ManyToOne
	@JoinColumn(name="product_id")//agregar el id de la tabla en la BD
	private Products product;
	
//INICIO LLAVE DERIVADA 
	//N:1
	@ManyToOne
	@MapsId("orderIdFK")//nombre dado en clase OrderItemsPK
	@JoinColumn(name="order_id")
	private Orders order;
//FIN DE LLAVE DERIVADA
}
