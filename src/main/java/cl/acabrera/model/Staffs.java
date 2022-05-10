package cl.acabrera.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="staffs")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Staffs {
	@Id
	@Column(name="staff_id")
	private int staffId;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String email;
	
	private String phone;
	
	private int active;
	
//INICIO relaciones RECURSIVAS

	@ManyToOne
	@JoinColumn(name="manager_id", referencedColumnName = "staff_id")
	private Staffs managerId;
	
	@OneToMany(mappedBy="managerId" )
	private List<Staffs> staffsHijo;
	
//FIN relacion recursiva

	//n:1 Relación con clase Stores
	@ManyToOne
	@JoinColumn(name="store_id")//agregar el id de la tabla en la BD
	private Stores store;

	//1:n Relación con clase Orders
//	@JsonBackReference
//	@OneToMany(targetEntity=Orders.class, mappedBy="staff", cascade= {CascadeType.MERGE,CascadeType.REFRESH}, fetch=FetchType.LAZY)
	@OneToMany(mappedBy="staff")
	private List<Orders> ordersStaffsList;

	
	
}
