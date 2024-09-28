package org.cibertec;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "factura")
public class Factura {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int nro_factura ;
	@Column(nullable = false)
	int id_cliente;
	@Column(nullable = false)
	Date fecha;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	Estado estado;
	@Column(nullable = false)
	double total;
	public int getNro_factura() {
		return nro_factura;
	}
	public void setNro_factura(int nro_factura) {
		this.nro_factura = nro_factura;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
