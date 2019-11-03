package com.stock.services;

import java.util.List;

import com.stock.entities.Client;

public interface IClientService {
	public Client save(Client entity);
	
	public Client update(Client entity);
	
	public void remove(Long id);
	
	public Client findOneById(Long id);
	
	public Client findOneBy(String field, Object value); 
	
	public Client findOneBy(String[] fields, Object[] values);
	
	public List<Client> findAll();
	
	public List<Client> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
