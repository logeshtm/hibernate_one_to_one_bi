package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
		Person p= new Person();
		p.setName("logesh");
		p.setAge(20);
		
		Pancard ca= new Pancard();
		ca.setCountry("india");
		ca.setPhno(12345);
		ca.setPerson(p);
		p.setPancard(ca);
		
		et.begin();
		em.persist(ca);
		em.persist(p);
		et.commit();
		
	}

}
