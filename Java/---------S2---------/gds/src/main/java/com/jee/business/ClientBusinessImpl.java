package com.jee.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jee.dao.ClientDao;
import com.jee.models.Client;

public class ClientBusinessImpl implements ClientBusiness {
	private ClientDao dao;

	public ClientBusinessImpl() {
	}

	public ClientBusinessImpl(ClientDao dao) {
		this.dao = dao;
	}

	public ClientDao getDao() {
		return dao;
	}

	public void setDao(ClientDao dao) {
		this.dao = dao;
	}

	public Client addClient(Client c) {
		return dao.insertClient(c);
	}

	public Client getClient(Long id) {
		return dao.selectClient(id);
	}

	public List<Client> getByKeyWord(String keyWord) {
		return dao.selectByKeyWord(keyWord);
	}

	public Client modifyClient(Client c) {
		return dao.updateClient(c);
	}

	public void removeClient(Long id) {
		dao.deleteClient(id);
	}

	public List<Long> getClientsIds() {
		List<Long> l = new ArrayList<Long>();
		List<Client> lc = getByKeyWord("%");
		for (Client client : lc) {
			l.add(client.getId());
		}
		return l;
	}
	
}
