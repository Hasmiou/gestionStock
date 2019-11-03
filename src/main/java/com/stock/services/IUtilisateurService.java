package com.stock.services;

import java.util.List;

import com.stock.entities.Utilisateur;

public interface IUtilisateurService {
	public Utilisateur save(Utilisateur entity);
	
	public Utilisateur update(Utilisateur entity);
	
	public void remove(Long id);
	
	public Utilisateur findOneById(Long id);
	
	public Utilisateur findOneBy(String field, Object value); 
	
	public Utilisateur findOneBy(String[] fields, Object[] values);
	
	public List<Utilisateur> findAll();
	
	public List<Utilisateur> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
