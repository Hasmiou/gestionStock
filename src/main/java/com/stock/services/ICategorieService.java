package com.stock.services;

import java.util.List;

import com.stock.entities.Categorie;

public interface ICategorieService {
	public Categorie save(Categorie entity);
	
	public Categorie update(Categorie entity);
	
	public void remove(Long id);
	
	public Categorie findOneById(Long id);
	
	public Categorie findOneBy(String field, Object value); 
	
	public Categorie findOneBy(String[] fields, Object[] values);
	
	public List<Categorie> findAll();
	
	public List<Categorie> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
