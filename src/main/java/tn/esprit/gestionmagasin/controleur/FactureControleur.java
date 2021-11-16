

package tn.esprit.gestionmagasin.controleur;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasin.entities.Facture;
import tn.esprit.gestionmagasin.service.IClientService;
import tn.esprit.gestionmagasin.service.IFactureService;

import java.text.*;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/facture")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class FactureControleur {

	@Autowired
	private IFactureService factureService;

/*	@Autowired
	private IClientService clientService;*/

	@PostMapping("/addFacture")
	public boolean ajout(@RequestBody  Facture f) {
        factureService.addFacture(f);
        return true;
	/*System.out.println("----------> Object recus : " + obj);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateFacture=null;
		try {
			dateFacture = dateFormat.parse(obj.get("dateFacture").toString());
			System.out.println("date ---------->"+dateFacture.toString());
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		float monatantRemise  = Float.parseFloat(obj.get("monatantRemise").toString());
		float monatantFacture  = Float.parseFloat(obj.get("monatantFacture").toString());
		Boolean active  = Boolean.parseBoolean(obj.get("active").toString());
		Long client  = Long.parseLong(obj.get("client").toString());
		//String client  = obj.get("client").toString();

		factureService.addFacture(dateFacture, monatantRemise, monatantFacture, active, client);*/

	}

	@PutMapping("/facture/{id}")
	public boolean update(@RequestBody Facture fac) {
		factureService.editFacture(fac);
		return true;
	}

	@GetMapping("/facture/{id}")
	public Facture getById(@PathVariable("id") long id) {
		System.out.println("----------> IDD : " + id);
		Facture col = factureService.getFacture(id);
		return col;
	}

	@GetMapping("/getAllFacture")
	public List<Facture> getAll() {
		return factureService.getFactures();
	}

	@DeleteMapping("/facture/{id}")
	public boolean  delete(@PathVariable long id) {
		factureService.deleteFacture(id);
		return true;
	}


	
	
	



	}

