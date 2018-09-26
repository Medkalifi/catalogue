package ma.moha.tp.metier;

import java.util.List;

import ma.moha.tp.dao.ICatalogueDAO;
import ma.moha.tp.dao.Produit;

public class CatalogueMetierImpl implements ICatalogueMetier{


	private ICatalogueDAO dao;

	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}


	@Override
	public void addProduit(Produit p) {
		dao.addProduit(p);
		
	}

	@Override
	public List<Produit> getAllProduits() {
		
		return dao.getAllProduits();
	}

	@Override
	public List<Produit> getProduits(String mc) {
		
		return dao.getProduits(mc);
	}

	@Override
	public Produit getProduit(String reference) {
	
		return dao.getProduit(reference);
	}

	@Override
	public void deleteProduit(String reference) {
		dao.deleteProduit(reference);
		
	}

	@Override
	public void updateProduit(Produit p) {
		dao.updateProduit(p);
		
	}
}
