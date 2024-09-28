package org.cibertec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	int idProd;
	@Column(nullable = false)
	String nom_prod;
	@Column(nullable = false)
	double precio;
	@Column(nullable = false)
	int stock_actual;
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	public String getNom_prod() {
		return nom_prod;
	}
	public void setNom_prod(String nom_prod) {
		this.nom_prod = nom_prod;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock_actual() {
		return stock_actual;
	}
	public void setStock_actual(int stock_actual) {
		this.stock_actual = stock_actual;
	}
	
}
