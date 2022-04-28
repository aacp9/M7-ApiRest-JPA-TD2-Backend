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
@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Brands {

	@Id
	@Column(name="brand_id")
	private int brandId;

	@Column(name="brand_name")
	private String brandName;
	
	//1:n Relación con clase Products
	@JsonBackReference //resuelve el problema de los enlaces externos anidados
	@OneToMany(targetEntity=Products.class, mappedBy="brand", cascade= {CascadeType.MERGE,CascadeType.REFRESH}, fetch=FetchType.LAZY)
	private List<Products> productsBrandsList;
}
