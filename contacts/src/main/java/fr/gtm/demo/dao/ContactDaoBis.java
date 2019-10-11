package fr.gtm.demo.dao;

import javax.persistence.EntityManagerFactory;

import fr.gtm.demo.entities.Contact;

public class ContactDaoBis extends AbstractDAO<Contact, Long>{

	public ContactDaoBis(EntityManagerFactory emf) {
		super(emf, Contact.class);
		// TODO Auto-generated constructor stub
	}

}
