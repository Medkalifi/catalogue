package ma.moha.tp.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.moha.tp.dao.Produit;
import ma.moha.tp.metier.ICatalogueMetier;
@Controller
public  class  CatalogueController	{ 

@Autowired
private ICatalogueMetier	metier;

	
public void setMetier(ICatalogueMetier metier) {
	this.metier = metier;
}
@RequestMapping("/index")
public String	index(Model	model){  model.addAttribute("produit",new	Produit()); 
model.addAttribute("produits",	metier.getAllProduits());  return "produits";
}

@RequestMapping("/saveProduit")
public  String	save(@Valid	Produit	p,BindingResult	bindingResult,Model  model){
if(bindingResult.hasErrors()){  model.addAttribute("produits",metier.getAllProduits()); 
	 return "produits";
}
metier.addProduit(p); 
model.addAttribute("produit",new	Produit());
model.addAttribute("produits",	metier.getAllProduits()); 
return "produits";
}


	
@RequestMapping("/deleteProduit")
public  String	delete(@RequestParam	String	ref,Model	model){  
	metier.deleteProduit(ref);  model.addAttribute("produit",new	Produit());
	model.addAttribute("produits",	metier.getAllProduits());  return "produits";
}

@RequestMapping("/editProduit")
public String edit(@RequestParam String ref, Model model){
model.addAttribute("produit",metier.getProduit(ref));
model.addAttribute("produits",metier.getAllProduits());
return "produits";

}
}

