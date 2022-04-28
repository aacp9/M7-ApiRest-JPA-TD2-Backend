package cl.acabrera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="products")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Products {

	@Id
	@Column(name="product_id")
	private int productId;

	@Column(name="product_name")
	private String productName;

	@Column(name="model_year")
	private int modelYear;

	@Column(name="list_price")
	private int listPrice;
	
	
	//n:1 Relación con clase Brands
	@ManyToOne
	@JoinColumn(name="brand_id")//agregar el id de la tabla en la BD
	private Brands brand;

	//n:1 Relación con clase Categories
	@ManyToOne
	@JoinColumn(name="category_id" )//agregar el id de la tabla en la BD
	private Categories category;
	
}
