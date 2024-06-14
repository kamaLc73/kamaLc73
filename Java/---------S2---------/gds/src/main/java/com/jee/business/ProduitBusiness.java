package com.jee.business;

import java.util.List;

import com.jee.models.Produit;

public interface ProduitBusiness {

	public Produit addProduit(Produit p);
	public Produit getProduit(Long ref);
	public List<Produit> getByKeyWord(String keyWord);
	public Produit modifyProduit(Produit p);
	public void removeProduit(Long ref);
	public List<Long> getProduitsRefs();

}
