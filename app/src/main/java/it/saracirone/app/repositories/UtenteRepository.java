package it.saracirone.app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.saracirone.app.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	

}
