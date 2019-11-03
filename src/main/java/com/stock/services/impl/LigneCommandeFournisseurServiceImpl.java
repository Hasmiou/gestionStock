package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.ILigneCommandeFournisseurDao;
import com.stock.dao.impl.LigneCommandeFournisseurDaoImpl;
import com.stock.entities.LigneCommandeFournisseur;
import com.stock.services.ILigneCommandeFournisseurService;

@Transactional
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService{
	
	private ILigneCommandeFournisseurDao dao;

	public LigneCommandeFournisseurServiceImpl(LigneCommandeFournisseurDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeFournisseur findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public LigneCommandeFournisseur findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public LigneCommandeFournisseur findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<LigneCommandeFournisseur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<LigneCommandeFournisseur> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
