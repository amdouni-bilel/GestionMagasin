package tn.esprit.gestionmagasin.service;

import tn.esprit.gestionmagasin.entities.Facture;

import java.util.Date;
import java.util.List;

public interface IFactureService {
	
	public  void addFacture(Facture f/*Date dateFacture, float monatantRemise, float monatantFacture, Boolean active, int client*/);
	public  void editFacture(Facture f);
	public  Facture getFacture(long id);
	public  List<Facture> getFactures();
	public  void deleteFacture(long id);

}
