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
@Table(name="categories")
@Getter
@Setter
@AllArgsConstructor //constructor con parámetros
@NoArgsConstructor	//constructor sin parametros
public class Categories {

	@Id
	@Column(name="category_id")
	private int categoryId;

	@Column(name="category_name")
	private String categoryName;
	
	//1:n relación con clase Products
	@JsonBackReference
	@OneToMany(targetEntity=Products.class, mappedBy="category", cascade= {CascadeType.MERGE,CascadeType.REFRESH}, fetch=FetchType.LAZY)
	private List<Products> productsCategoriesList;
}
