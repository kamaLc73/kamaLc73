package com.jee.business;

import java.util.ArrayList;
import java.util.List;

import com.jee.dao.ProduitDao;
import com.jee.models.Client;
import com.jee.models.Produit;

public class ProduitBusinessImpl implements ProduitBusiness {
	private ProduitDao dao;

	public ProduitBusinessImpl() {
	}

	public ProduitBusinessImpl(ProduitDao dao) {
		this.dao = dao;
	}

	public ProduitDao getDao() {
		return dao;
	}

	public void setDao(ProduitDao dao) {
		this.dao = dao;
	}

	public Produit addProduit(Produit p) {
		return dao.insertProduit(p);
	}

	public Produit getProduit(Long ref) {
		return dao.selectProduit(ref);
	}

	public List<Produit> getByKeyWord(String keyWord) {
		return dao.selectByKeyWord(keyWord);
	}

	public Produit modifyProduit(Produit p) {
		return dao.updateProduit(p);
	}

	public void removeProduit(Long ref) {
		dao.deleteProduit(ref);
	}

	public List<Long> getProduitsRefs() {
		List<Long> l = new ArrayList<Long>();
		List<Produit> lc = getByKeyWord("%");
		for (Produit produit : lc) {
			l.add(produit.getRef());
		}
		return l;
	}
	
}
