package com.jee.business;

import java.util.List;

import com.jee.models.Commande;

public interface CommandeBusiness {

	public Commande addCommande(Commande c);
	public Commande getCommande(Long id);
	public List<Commande> getByKeyWord(String keyWord);
	public Commande modifyCommande(Commande c);
	public void removeCommande(Long id);

}
