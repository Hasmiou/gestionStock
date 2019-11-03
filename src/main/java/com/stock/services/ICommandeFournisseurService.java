package com.stock.services;

import java.util.List;

import com.stock.entities.CommandeFournisseur;

public interface ICommandeFournisseurService {
	public CommandeFournisseur save(CommandeFournisseur entity);
	
	public CommandeFournisseur update(CommandeFournisseur entity);
	
	public void remove(Long id);
	
	public CommandeFournisseur findOneById(Long id);
	
	public CommandeFournisseur findOneBy(String field, Object value); 
	
	public CommandeFournisseur findOneBy(String[] fields, Object[] values);
	
	public List<CommandeFournisseur> findAll();
	
	public List<CommandeFournisseur> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
