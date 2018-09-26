package ma.moha.tp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;



public class CatalogueDaoImpl  implements ICatalogueDAO{

	private Map<String, Produit> produits = new HashMap<String, Produit>();
	
	

	Logger logger = Logger.getLogger(CatalogueDaoImpl.class);
	@Override
	public void addProduit(Produit p) {
		produits.put(p.getReference(), p);
		
	}

	@Override
	public List<Produit> getAllProduits() {
		Collection<Produit> prods =produits.values();
		return new ArrayList<Produit>(prods);
	}

	@Override
	public List<Produit> getProduits(String mc) {
List<Produit> prods= new ArrayList<Produit>();

 for (Produit p : produits.values()) 
	if (p.getDesignation().indexOf(mc)>=0)
		prods.add(p);

return prods;
	}

	@Override
	public Produit getProduit(String reference) {
		
		return produits.get(reference);
	}

	@Override
	public void deleteProduit(String reference) {
		produits.remove(reference);
		
	}

	@Override
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);
		
	}
	
	public void init() {
		logger.info("initialisation du catalogue");
		
	this.addProduit(new Produit("HP654", "ordianteurHP", 800, 5));	
	this.addProduit(new Produit("AEP65", "Imprimante", 76, 80));	
	this.addProduit(new Produit("AT980", "Smart phone GT", 450, 8));
		
		
		
	}
	

}
