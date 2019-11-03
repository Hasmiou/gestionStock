package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.ILigneVenteDao;
import com.stock.dao.impl.LigneVenteDaoImpl;
import com.stock.entities.LigneVente;
import com.stock.services.ILigneVenteService;

@Transactional
public class LigneVenteServiceImpl implements ILigneVenteService{
	
	private ILigneVenteDao dao;

	public LigneVenteServiceImpl(LigneVenteDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public LigneVente save(LigneVente entity) {
		return dao.save(entity);
	}

	@Override
	public LigneVente update(LigneVente entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneVente findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public LigneVente findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public LigneVente findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<LigneVente> findAll() {
		return dao.findAll();
	}

	@Override
	public List<LigneVente> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
