package com.jee.dao;

import java.util.List;

import com.jee.models.Produit;

public interface ProduitDao {

	public Produit insertProduit(Produit p);
	public Produit selectProduit(Long ref);
	public List<Produit> selectByKeyWord(String keyWord);
	public Produit updateProduit(Produit p);
	public void deleteProduit(Long ref);

}
