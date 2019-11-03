package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.IUtilisateurDao;
import com.stock.dao.impl.UtilisateurDaoImpl;
import com.stock.entities.Utilisateur;
import com.stock.services.IUtilisateurService;

@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService{
	
	private IUtilisateurDao dao;

	public UtilisateurServiceImpl(UtilisateurDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public Utilisateur save(Utilisateur entity) {
		return dao.save(entity);
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Utilisateur findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public Utilisateur findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public Utilisateur findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<Utilisateur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Utilisateur> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
