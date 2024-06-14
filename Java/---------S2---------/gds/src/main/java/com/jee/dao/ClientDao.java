package com.jee.dao;

import java.util.List;

import com.jee.models.Client;


public interface ClientDao {

	public Client insertClient(Client c);
	public Client selectClient(Long id);
	public List<Client> selectByKeyWord(String keyWord);
	public Client updateClient(Client c);
	public void deleteClient(Long id);

}
