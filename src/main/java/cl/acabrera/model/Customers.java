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
@Table(name="customers")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Customers {
	@Id
	@Column(name="customer_id")
	private int customerId;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;

	@Column(name="zip_code")
	private String zipCode;
	
	//1:n
	@JsonBackReference
//	@OneToMany(targetEntity=Orders.class, mappedBy="customer", cascade= {CascadeType.MERGE,CascadeType.REFRESH}, fetch=FetchType.LAZY)
	@OneToMany(mappedBy="customer")
	private List<Orders> ordersCustomersList;

}
