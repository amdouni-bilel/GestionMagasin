package tn.esprit.gestionmagasin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasin.entities.Produit;

public interface IProduitDAO extends JpaRepository<Produit, Long> {

}
