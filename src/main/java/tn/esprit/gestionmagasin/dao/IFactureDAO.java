package tn.esprit.gestionmagasin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasin.entities.Facture;

public interface IFactureDAO extends JpaRepository<Facture, Long> {

}
