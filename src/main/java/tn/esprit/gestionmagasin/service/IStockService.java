package tn.esprit.gestionmagasin.service;

import tn.esprit.gestionmagasin.entities.Stock;
import java.util.Date;
import java.util.List;

public interface IStockService {
	
	public  void addStock(Stock stock);
	public  void editStock(Stock stock);
	public Stock getStock(long id);
	public  List<Stock> getStocks();
	public  void deleteStock(long id);

}
