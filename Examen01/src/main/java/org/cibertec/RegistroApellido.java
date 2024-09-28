package org.cibertec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RegistroApellido {
	EntityManagerFactory factory;
	EntityManager em;
	Factura fa;
	
	private void registrarFactura(Factura data) {
		factory = Persistence.createEntityManagerFactory("ExamenLP2");
		em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		System.out.println("Estudiante registrado exitosamente");
	}
	public static void main(String[] args) {
		RegistroApellido p = new RegistroApellido();
		try {
			Factura fa = new Factura();
			fa.setEstado(Estado.Anulado);
			fa.setId_cliente(1);
			fa.setTotal(120);
			p.registrarFactura(fa);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
