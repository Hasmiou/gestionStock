package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.IFournisseurDao;
import com.stock.dao.impl.FournisseurDaoImpl;
import com.stock.entities.Fournisseur;
import com.stock.services.IFournisseurService;

@Transactional
public class FournisseurServiceImpl implements IFournisseurService{
	
	private IFournisseurDao dao;

	public FournisseurServiceImpl(FournisseurDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Fournisseur findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public Fournisseur findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public Fournisseur findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<Fournisseur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Fournisseur> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
