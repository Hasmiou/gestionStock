package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.ICommandeClientDao;
import com.stock.dao.impl.CommandeClientDaoImpl;
import com.stock.entities.CommandeClient;
import com.stock.services.ICommandeClientService;

@Transactional
public class CommandeClientServiceImpl implements ICommandeClientService{
	
	private ICommandeClientDao dao;
	
	public CommandeClientServiceImpl(CommandeClientDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public CommandeClient save(CommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeClient update(CommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public CommandeClient findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public CommandeClient findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public CommandeClient findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<CommandeClient> findAll() {
		return dao.findAll();
	}

	@Override
	public List<CommandeClient> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
