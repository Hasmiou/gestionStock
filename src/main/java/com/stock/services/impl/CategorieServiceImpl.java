package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.ICategorieDao;
import com.stock.dao.impl.CategorieDaoImpl;
import com.stock.entities.Categorie;
import com.stock.services.ICategorieService;

@Transactional
public class CategorieServiceImpl implements ICategorieService{
	
	private ICategorieDao dao;
	
	
	public CategorieServiceImpl(CategorieDaoImpl dao) {
		this.dao = dao;
	}


	@Override
	public Categorie save(Categorie entity) {
		return dao.save(entity);
	}

	@Override
	public Categorie update(Categorie entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Categorie findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public Categorie findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public Categorie findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<Categorie> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Categorie> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
