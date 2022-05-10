package cl.acabrera.model;

//import java.util.List;

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
	
	
	@Column(name="manager_id")
	private int managerId;

	//n:1 Relación con clase Stores
	@ManyToOne
	@JoinColumn(name="store_id")//agregar el id de la tabla en la BD
	private Stores store;

	
	
}
