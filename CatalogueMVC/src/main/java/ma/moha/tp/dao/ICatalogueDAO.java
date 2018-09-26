package ma.moha.tp.dao;

import java.util.List;

import ma.moha.tp.dao.Produit;

public interface ICatalogueDAO {

	public	void	addProduit(Produit	p);
	public	List<Produit>	getAllProduits();  
	public	List<Produit>	getProduits(String mc); 
	 public	Produit	getProduit(String	reference); 
	 public	void	deleteProduit(String	refernce); 
	 public	void	updateProduit(Produit		p);

	
}
