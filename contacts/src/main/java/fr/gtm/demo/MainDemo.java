package fr.gtm.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.gtm.demo.dao.AdresseDAO;
import fr.gtm.demo.dao.ContactDAO;
import fr.gtm.demo.entities.Adresse;
import fr.gtm.demo.entities.Civilite;
import fr.gtm.demo.entities.Contact;

public class MainDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contacts");
		ContactDAO dao = new ContactDAO(emf);

		List<Contact> contacts = dao.ContactWithAdresse();
		contacts.forEach(System.out::println);

		emf.close();
	}

}
