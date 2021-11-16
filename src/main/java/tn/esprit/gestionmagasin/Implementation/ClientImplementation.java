package tn.esprit.gestionmagasin.Implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasin.dao.IClientDAO;
import tn.esprit.gestionmagasin.entities.Client;
import tn.esprit.gestionmagasin.service.IClientService;

import java.util.List;


@Service
public class ClientImplementation implements IClientService {

	@Autowired
	private IClientDAO clientRepository;

	@Override
	public void addClient(Client client) {
     clientRepository.save(client) ;
	}

	@Override
	public void editClient(Client client) {
		clientRepository.save(client) ;

	}

	@Override
	public Client getClient(long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	@Override
	public void deleteClient(long id) {
		clientRepository.deleteById(id);

	}

	}
