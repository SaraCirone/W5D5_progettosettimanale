package it.saracirone.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.saracirone.app.entities.Ruolo;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo, Integer>{

}
