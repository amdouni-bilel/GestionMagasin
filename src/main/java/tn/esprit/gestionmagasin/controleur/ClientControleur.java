package tn.esprit.gestionmagasin.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasin.entities.Client;
import tn.esprit.gestionmagasin.service.IClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class ClientControleur {

	@Autowired
	private IClientService clientService;

	@GetMapping("/getAllClient")
	public List<Client> getAll() {
		return clientService.getClients();
	}

	@PostMapping("/addClient")
	public boolean ajout(@RequestBody Client col) {
		clientService.addClient(col);
		return true;
	}

	@PutMapping("/client")
	public boolean update(@RequestBody Client col) {
		clientService.editClient(col);
		return true;
	}

	@GetMapping("/client/{id}")
	public Client getById(@PathVariable("id") long id) {
		System.out.println("----------> IDD : " + id);
		Client col = clientService.getClient(id);
		return col;

	}

	@DeleteMapping("/client/{id}")
	public boolean  delete(@PathVariable long id) {
		clientService.deleteClient(id);
		return true;
	}


	
	
	

}
