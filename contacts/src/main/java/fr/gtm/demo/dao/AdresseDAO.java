package fr.gtm.demo.dao;

import javax.persistence.EntityManagerFactory;

import fr.gtm.demo.entities.Adresse;

public class AdresseDAO extends AbstractDAO<Adresse, Long>{
	
	public AdresseDAO(EntityManagerFactory emf) {
		super(emf, Adresse.class);
		// TODO Auto-generated constructor stub
	}
}
