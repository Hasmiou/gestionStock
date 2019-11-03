package com.stock.services;

import java.util.List;

import com.stock.entities.Vente;

public interface IVenteService {
	public Vente save(Vente entity);
	
	public Vente update(Vente entity);
	
	public void remove(Long id);
	
	public Vente findOneById(Long id);
	
	public Vente findOneBy(String field, Object value); 
	
	public Vente findOneBy(String[] fields, Object[] values);
	
	public List<Vente> findAll();
	
	public List<Vente> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
