package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.ICommandeFournisseurDao;
import com.stock.dao.impl.CommandeFournisseurDaoImpl;
import com.stock.entities.CommandeFournisseur;
import com.stock.services.ICommandeFournisseurService;

@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService{
	
	private ICommandeFournisseurDao dao;
	
	public CommandeFournisseurServiceImpl(CommandeFournisseurDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public CommandeFournisseur save(CommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public CommandeFournisseur findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public CommandeFournisseur findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public CommandeFournisseur findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<CommandeFournisseur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<CommandeFournisseur> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
