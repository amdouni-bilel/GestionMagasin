package tn.esprit.gestionmagasin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasin.entities.Stock;

public interface IStockDAO extends JpaRepository<Stock, Long> {

}
