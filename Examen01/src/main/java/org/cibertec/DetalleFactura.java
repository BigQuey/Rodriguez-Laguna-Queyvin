package org.cibertec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "detallefact")
public class DetalleFactura {
	@Id
	int nro_factura;
	@Id
	int id_prod;
	@Column(nullable = false)
	int cantidad;
	public int getNro_factura() {
		return nro_factura;
	}
	public void setNro_factura(int nro_factura) {
		this.nro_factura = nro_factura;
	}
	public int getId_prod() {
		return id_prod;
	}
	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
