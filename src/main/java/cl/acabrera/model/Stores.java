package cl.acabrera.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
	
	//1:n Relación con clase Staff
	@JsonBackReference //resuelve el problema de los enlaces externos anidados
	@OneToMany(targetEntity=Staffs.class, mappedBy="store", cascade= {CascadeType.MERGE,CascadeType.REFRESH}, fetch=FetchType.LAZY)
	private List<Staffs> staffsStoresList;
	
	//1:n Relación con clase Orders
	@JsonBackReference
	@OneToMany(targetEntity=Orders.class, mappedBy="store", cascade= {CascadeType.MERGE,CascadeType.REFRESH}, fetch=FetchType.LAZY)
	private List<Orders> ordersStoresList;

	 
}
