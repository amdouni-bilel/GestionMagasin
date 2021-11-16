
package tn.esprit.gestionmagasin.Implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasin.dao.IClientDAO;
import tn.esprit.gestionmagasin.dao.IFactureDAO;
import tn.esprit.gestionmagasin.dao.IProduitDAO;
import tn.esprit.gestionmagasin.entities.Facture;
import tn.esprit.gestionmagasin.entities.Produit;
import tn.esprit.gestionmagasin.service.IFactureService;
import tn.esprit.gestionmagasin.service.IProduitService;

import java.util.Date;
import java.util.List;


@Service
public class ProduitImplementation implements IProduitService {

	@Autowired
	private IProduitDAO produitRepository;
	/*@Autowired
	private IClientDAO clientRepository;*/

	@Override
	public void addProduit(Produit produit) {produitRepository.save(produit);}
	@Override
	public void editProduit(Produit produit) { produitRepository.save(produit) ;}

	@Override
	public Produit getProduit(long id) {return produitRepository.findById(id).get();	}

	@Override
	public List<Produit> getProduits() {return produitRepository.findAll();
	}

	@Override
	public void deleteProduit(long id) { produitRepository.deleteById(id);	}

	}

