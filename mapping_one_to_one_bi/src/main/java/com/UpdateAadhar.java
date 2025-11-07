package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateAadhar {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Find existing Aadharcard by its ID (Primary Key)
        Aadharcard ad = em.find(Aadharcard.class, 234234234);

        if (ad != null) {
            // Update fields
            ad.setFname("Aagan");
            ad.setDob("12-12-12");

            et.begin();
            em.merge(ad); // merge ensures the changes are synchronized with DB
            et.commit();

            System.out.println("✅ Aadhar details updated successfully!");
        } else {
            System.out.println("⚠️ Data not found for ID = 234234234");
        }

        // Always close EntityManager and Factory
        em.close();
        emf.close();
    }
}
