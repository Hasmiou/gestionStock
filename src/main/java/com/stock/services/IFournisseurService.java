package com.stock.services;

import java.util.List;

import com.stock.entities.Fournisseur;

public interface IFournisseurService {
	public Fournisseur save(Fournisseur entity);
	
	public Fournisseur update(Fournisseur entity);
	
	public void remove(Long id);
	
	public Fournisseur findOneById(Long id);
	
	public Fournisseur findOneBy(String field, Object value); 
	
	public Fournisseur findOneBy(String[] fields, Object[] values);
	
	public List<Fournisseur> findAll();
	
	public List<Fournisseur> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
