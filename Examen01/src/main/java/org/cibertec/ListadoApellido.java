package org.cibertec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.List;

public class ListadoApellido {
	EntityManagerFactory factory;
	EntityManager em;
	Factura fa;

	public void listarFactura() throws Exception {
		factory = Persistence.createEntityManagerFactory("Examen01");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Factura> q = em.createQuery("select e from Estudiante e", Factura.class);
		List<Factura> facs = q.getResultList();

		for (Factura factura : facs) {
			System.out.println("Nro Inventario: " + factura.getNro_factura());
			System.out.println("Fecha: " + factura.getFecha());
			System.out.println("Total" + factura.getTotal());
			System.out.println("Cliente" + factura.getId_cliente());
			System.out.println("--------------------------------------");
		}
		em.getTransaction().commit();
		em.close();
		System.out.println("Exito");
	}
	public static void main(String[] args) {
		ListadoApellido p = new ListadoApellido();

		try {

			p.listarFactura();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error ");
		}

	}

}
