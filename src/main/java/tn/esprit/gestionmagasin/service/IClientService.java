package tn.esprit.gestionmagasin.service;

import tn.esprit.gestionmagasin.entities.Client;

import java.util.List;

public interface IClientService {
	
	public  void addClient(Client client);
	public  void editClient(Client client);
	public  Client getClient(long id);
	public  List<Client> getClients();
	public  void deleteClient(long id);

}
