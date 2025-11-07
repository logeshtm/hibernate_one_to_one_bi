package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchPancard {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Pancard pc = em.find(Pancard.class, 1);
		
		System.out.println(pc);
		System.out.println(pc.getPerson());
		
	}

}
