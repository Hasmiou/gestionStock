package com.stock.services;

import java.util.List;

import com.stock.entities.CommandeClient;

public interface ICommandeClientService {
	public CommandeClient save(CommandeClient entity);
	
	public CommandeClient update(CommandeClient entity);
	
	public void remove(Long id);
	
	public CommandeClient findOneById(Long id);
	
	public CommandeClient findOneBy(String field, Object value); 
	
	public CommandeClient findOneBy(String[] fields, Object[] values);
	
	public List<CommandeClient> findAll();
	
	public List<CommandeClient> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
