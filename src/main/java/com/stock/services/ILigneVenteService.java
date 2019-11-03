package com.stock.services;

import java.util.List;

import com.stock.entities.LigneVente;

public interface ILigneVenteService {
	public LigneVente save(LigneVente entity);
	
	public LigneVente update(LigneVente entity);
	
	public void remove(Long id);
	
	public LigneVente findOneById(Long id);
	
	public LigneVente findOneBy(String field, Object value); 
	
	public LigneVente findOneBy(String[] fields, Object[] values);
	
	public List<LigneVente> findAll();
	
	public List<LigneVente> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
