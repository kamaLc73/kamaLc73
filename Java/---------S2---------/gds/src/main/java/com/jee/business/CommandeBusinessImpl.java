package com.jee.business;

import java.util.List;

import com.jee.dao.CommandeDao;
import com.jee.models.Commande;

public class CommandeBusinessImpl implements CommandeBusiness {
	private CommandeDao dao;

	public CommandeBusinessImpl() {
	}

	public CommandeBusinessImpl(CommandeDao dao) {
		this.dao = dao;
	}

	public CommandeDao getDao() {
		return dao;
	}

	public void setDao(CommandeDao dao) {
		this.dao = dao;
	}

	public Commande addCommande(Commande c) {
		return dao.insertCommande(c);
	}

	public Commande getCommande(Long id) {
		return dao.selectCommande(id);
	}

	public List<Commande> getByKeyWord(String keyWord) {
		return dao.selectByKeyWord(keyWord);
	}

	public Commande modifyCommande(Commande c) {
		return dao.updateCommande(c);
	}

	public void removeCommande(Long id) {
		dao.deleteCommande(id);
	}
	
}
