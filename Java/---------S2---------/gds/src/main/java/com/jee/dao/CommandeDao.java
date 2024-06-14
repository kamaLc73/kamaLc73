package com.jee.dao;

import java.util.List;

import com.jee.models.Commande;

public interface CommandeDao {

	public Commande insertCommande(Commande c);
	public Commande selectCommande(Long id);
	public List<Commande> selectByKeyWord(String keyWord);
	public Commande updateCommande(Commande c);
	public void deleteCommande(Long id);

}
