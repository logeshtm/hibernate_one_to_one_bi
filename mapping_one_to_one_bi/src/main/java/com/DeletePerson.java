package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePerson {
    public static void main(String[] args) {


        EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        
        Person ps=em.find(Person.class,1);
//        AadharCard ad=em.find(AadharCard.class,123);

        if (ps != null) {
            et.begin();
            em.remove(ps);
            et.commit();
            System.out.println(" Person deleted successfully.");
        } 
        else {
            System.out.println("No Person found with ID = 1");
        }
    }
}