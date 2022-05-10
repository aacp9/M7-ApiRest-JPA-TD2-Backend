package cl.acabrera.model;



import java.util.Date;

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
@Table(name="orders")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Orders {
	@Id
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="order_status")
	private int orderStatus;
	
//	@Column(name="order_date", columnDefinition = "DATE")//con esto puedo dejar el atributo oderData como String en vez de Date para manejo de string
	@Column(name="order_date")
	private Date orderDate;
	
//	@Column(name="required_date", columnDefinition = "DATE")
	@Column(name="required_date")
	private Date requiredDate;

//	@Column(name="shipped_date", columnDefinition = "DATE")
	@Column(name="shipped_date")
	private Date shippedDate;
	
	//n:1 relación con clase Customers
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customers customer;
	
	//n:1 relación con clase Stores
	@ManyToOne
	@JoinColumn(name="store_id")
	private Stores store;
	
	//n:1 relación con clase Staffs
	@ManyToOne
	@JoinColumn(name="staff_id")
	private Staffs staff;

}
