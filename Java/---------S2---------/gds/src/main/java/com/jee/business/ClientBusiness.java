package com.jee.business;

import java.util.List;

import com.jee.models.Client;

public interface ClientBusiness {

	public Client addClient(Client c);
	public Client getClient(Long id);
	public List<Client> getByKeyWord(String keyWord);
	public Client modifyClient(Client c);
	public void removeClient(Long id);
	public List<Long> getClientsIds();

}
