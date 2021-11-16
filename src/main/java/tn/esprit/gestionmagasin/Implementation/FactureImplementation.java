
package tn.esprit.gestionmagasin.Implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasin.dao.IClientDAO;
import tn.esprit.gestionmagasin.dao.IFactureDAO;
import tn.esprit.gestionmagasin.entities.Facture;
import tn.esprit.gestionmagasin.service.IFactureService;

import java.util.Date;
import java.util.List;


@Service
public class FactureImplementation implements IFactureService {

	@Autowired
	private IFactureDAO factureRepository;

    @Override
    public void addFacture(Facture f) {factureRepository.save(f);}

    @Override
    public void editFacture(Facture f) {factureRepository.save(f);}

    @Override
    public Facture getFacture(long id) {return factureRepository.findById(id).get();}

    @Override
    public List<Facture> getFactures() {return factureRepository.findAll(); }

    @Override
    public void deleteFacture(long id) {	factureRepository.deleteById(id);}





/*	@Autowired
	private IClientDAO clientRepository;*/
/*	@Override
	public void addFacture(Facture f *//*Date dateFacture,float monatantRemise, float monatantFacture, Boolean active, Long client*//*) {
	*//*	Facture e = new Facture();
		e.setDateFacture(dateFacture);
		e.setMonatantRemise(monatantRemise);
		e.setMonatantFacture(monatantFacture);
		e.setActive(active);
		e.setClient(clientRepository.findById(client).get());*//*
		factureRepository.save(f);
	}
*/

	}
