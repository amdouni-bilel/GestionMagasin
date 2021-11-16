package tn.esprit.gestionmagasin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasin.entities.Client;

public interface IClientDAO extends JpaRepository<Client, Long> {

}
