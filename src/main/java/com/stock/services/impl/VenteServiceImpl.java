package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.IVenteDao;
import com.stock.dao.impl.VenteDaoImpl;
import com.stock.entities.Vente;
import com.stock.services.IVenteService;

@Transactional
public class VenteServiceImpl implements IVenteService{
	
	private IVenteDao dao;

	public VenteServiceImpl(VenteDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public Vente save(Vente entity) {
		return dao.save(entity);
	}

	@Override
	public Vente update(Vente entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Vente findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public Vente findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public Vente findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<Vente> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Vente> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
