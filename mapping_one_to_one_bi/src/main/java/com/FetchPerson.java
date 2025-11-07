
package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchPerson {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
		
		Person p=em.find(Person.class, 1);
		System.out.print(p);
		System.out.print(p.getPancard());
	}

}
