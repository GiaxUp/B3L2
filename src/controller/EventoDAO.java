package controller;

import model.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("B3L3");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		// PER AGGIUNGERE:
		Evento e = new Evento();
		e.setTitle("Festa di compleanno incredibile");
		e.setDataEvento(java.sql.Date.valueOf("2013-09-04"));
		e.setDescrizione("Festa di compleanno per il mio cane.");
		e.setTipoEvento("Pubblico");
		e.setNumeroMassimoPartecipanti(100);
		// addEvent(e);
		
		
		
		try {
			// PER TROVARE:
			 Evento eventoLetto = findEvent(4l);
			 System.out.println(eventoLetto);

			// PER RIMUOVERE:
			// removeEvent(eventoLetto);

		} catch (Exception u) {
			// TODO
		} finally {
			em.close();
			emf.close();
		}
	}

	// Aggiungere un evento
	public static void addEvent(Evento e) {
		em.getTransaction().begin(); // Apri una transazione
		em.persist(e); // Comando JPA per gestire il salvataggio
		em.getTransaction().commit(); // Salva
		System.out.println("Evento salvato nel database.");
	}

	// Trovare un evento con ID
	public static Evento findEvent(Long id) {
		em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
		em.getTransaction().commit();
		return e;
	}

	// Eliminare un evento
	public static void removeEvent(Evento e) {
		em.getTransaction().begin();
		em.remove(e); // Comando JPA per gestire la rimozione
		em.getTransaction().commit();
		System.out.println("Utente eliminato correttamente.");
	}
}