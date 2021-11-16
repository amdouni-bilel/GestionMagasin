
package tn.esprit.gestionmagasin.controleur;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasin.entities.Facture;
import tn.esprit.gestionmagasin.entities.Produit;
import tn.esprit.gestionmagasin.service.IClientService;
import tn.esprit.gestionmagasin.service.IFactureService;
import tn.esprit.gestionmagasin.service.IProduitService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/produit")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class ProduitControleur {

	@Autowired
	private IProduitService produitService;

	@GetMapping("/getAllProduit")
	public List<Produit> getAll() {
		return produitService.getProduits();
	}


	@PostMapping("/addProduit")
	public boolean ajout(@RequestBody Produit p) {
		produitService.addProduit(p);
		return true;
	}

	@PutMapping("/produit/{id}")
	public boolean update(@RequestBody Produit fac) {
		produitService.editProduit(fac);
		return true;
	}

	@GetMapping("/produit/{id}")
	public Produit getById(@PathVariable("id") long id) {
		System.out.println("----------> IDD : " + id);
		Produit col = produitService.getProduit(id);
		return col;

	}

	@DeleteMapping("/produit/{id}")
	public boolean  delete(@PathVariable int id) {
		produitService.deleteProduit(id);
		return true;
	}

}

