package it.saracirone.app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  it.saracirone.app.entities.Dispositivo;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Integer>{

}
