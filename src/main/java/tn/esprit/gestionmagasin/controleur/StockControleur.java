
package tn.esprit.gestionmagasin.controleur;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasin.entities.Client;
import tn.esprit.gestionmagasin.entities.Facture;
import tn.esprit.gestionmagasin.entities.Stock;
import tn.esprit.gestionmagasin.service.IClientService;
import tn.esprit.gestionmagasin.service.IFactureService;
import tn.esprit.gestionmagasin.service.IStockService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/stock")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class StockControleur {

	@Autowired
	private IStockService stockService;

	@GetMapping("/getAllStock")
	public List<Stock> getAll() {
		return stockService.getStocks();
	}


	@PostMapping("/addStock")
	public boolean ajout(@RequestBody Stock s ) {
		stockService.addStock(s);
		return true;
	}

	@PutMapping("/stock/{id}")
	public boolean update(@RequestBody Stock s) {
		stockService.editStock(s);
		return true;
	}

	@GetMapping("/stock/{id}")
	public Stock getById(@PathVariable("id") long id) {
		System.out.println("----------> IDD : " + id);
		Stock col = stockService.getStock(id);
		return col;
	}

    @DeleteMapping("/stock/{id}")
	public boolean  delete(@PathVariable int id) {
		stockService.deleteStock(id);
		return true;
	}


	
	
	

}

