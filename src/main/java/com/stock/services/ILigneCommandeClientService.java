package com.stock.services;

import java.util.List;

import com.stock.entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
	public LigneCommandeClient save(LigneCommandeClient entity);
	
	public LigneCommandeClient update(LigneCommandeClient entity);
	
	public void remove(Long id);
	
	public LigneCommandeClient findOneById(Long id);
	
	public LigneCommandeClient findOneBy(String field, Object value); 
	
	public LigneCommandeClient findOneBy(String[] fields, Object[] values);
	
	public List<LigneCommandeClient> findAll();
	
	public List<LigneCommandeClient> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
