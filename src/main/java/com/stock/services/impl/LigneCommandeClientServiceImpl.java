package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.ILigneCommandeClientDao;
import com.stock.dao.impl.LigneCommandeClientDaoImpl;
import com.stock.entities.LigneCommandeClient;
import com.stock.services.ILigneCommandeClientService;

@Transactional
public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService{
	
	private ILigneCommandeClientDao dao;
	
	public LigneCommandeClientServiceImpl(LigneCommandeClientDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeClient findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public LigneCommandeClient findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public LigneCommandeClient findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<LigneCommandeClient> findAll() {
		return dao.findAll();
	}

	@Override
	public List<LigneCommandeClient> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
