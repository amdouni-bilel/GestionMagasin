package tn.esprit.gestionmagasin.service;

import tn.esprit.gestionmagasin.entities.Facture;
import tn.esprit.gestionmagasin.entities.Produit;

import java.util.Date;
import java.util.List;

public interface IProduitService {
	
	public  void addProduit(Produit produit/*Date dateFacture, float monatantRemise, float monatantFacture, Boolean active, Long client*/);
	public  void editProduit(Produit produit);
	public  Produit getProduit(long id);
	public  List<Produit> getProduits();
	public  void deleteProduit(long id);

}
