package cl.acabrera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stores")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Stores {
	
	@Id
	@Column(name="store_id", insertable = false, updatable = false)
	private int storeId;
	
	@Column(name="store_name")
	private String storeName;

	private String phone; 
	private String email; 
	private String street; 
	private String city; 
	private String state; 

	@Column(name="zip_code")
	private String zipCode; 
	 
}
