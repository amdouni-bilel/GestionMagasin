
package tn.esprit.gestionmagasin.Implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasin.dao.IClientDAO;
import tn.esprit.gestionmagasin.dao.IFactureDAO;
import tn.esprit.gestionmagasin.dao.IStockDAO;
import tn.esprit.gestionmagasin.entities.Facture;
import tn.esprit.gestionmagasin.entities.Stock;
import tn.esprit.gestionmagasin.service.IFactureService;
import tn.esprit.gestionmagasin.service.IStockService;

import java.util.Date;
import java.util.List;


@Service
public class StockImplementation implements IStockService {

	@Autowired
	private IStockDAO stockRepository;

	@Override
	public void addStock(Stock stock) {
		stockRepository.save(stock);
	}
	@Override
	public void editStock(Stock stock) { stockRepository.save(stock) ;}

	@Override
	public Stock getStock(long id) {
		return stockRepository.findById(id).get();
	}

	@Override
	public List<Stock> getStocks() {
		return stockRepository.findAll();
	}

	@Override
	public void deleteStock(long id) { stockRepository.deleteById(id);

	}

	}

