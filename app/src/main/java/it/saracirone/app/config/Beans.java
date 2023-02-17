package it.saracirone.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import  it.saracirone.app.entities.Dispositivo;
import  it.saracirone.app.entities.Ruolo;
import  it.saracirone.app.entities.StatoDispositivo;
import  it.saracirone.app.entities.TipoDispositivo;
import  it.saracirone.app.entities.TipoRuolo;
import  it.saracirone.app.entities.Utente;

@Configuration
public class Beans {

	@Bean
	@Scope("prototype")
	public Utente utente(String nome, String cognome, String email, String password, String username) {
		
		return Utente.builder()
				.nome(nome)
				.cognome(cognome)
				.email(email)
				.password(password)
				.username(username)
				.attivo(true)
				.build();	
	}
	
	@Bean
    @Scope("prototype")
    public Ruolo ruolo(TipoRuolo rt) {
        return Ruolo.builder()
                .tipoRuolo(rt)
                .build();
    }
	
	@Bean
    @Scope("prototype")
    public Dispositivo dispositivo(TipoDispositivo td, StatoDispositivo sd) {
        return Dispositivo.builder()
                .tipoDispositivo(td)
                .stato(sd)
                .build();
    }
}
