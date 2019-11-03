package com.stock.services;

import java.util.List;

import com.stock.entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);
	
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
	
	public void remove(Long id);
	
	public LigneCommandeFournisseur findOneById(Long id);
	
	public LigneCommandeFournisseur findOneBy(String field, Object value); 
	
	public LigneCommandeFournisseur findOneBy(String[] fields, Object[] values);
	
	public List<LigneCommandeFournisseur> findAll();
	
	public List<LigneCommandeFournisseur> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
