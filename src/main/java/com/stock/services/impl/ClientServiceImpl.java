package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.IClientDao;
import com.stock.dao.impl.ClientDaoImpl;
import com.stock.entities.Client;
import com.stock.services.IClientService;

@Transactional
public class ClientServiceImpl implements IClientService{
	
	private IClientDao dao;

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	@Override
	public Client save(Client entity) {
		return dao.save(entity);
	}

	@Override
	public Client update(Client entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Client findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public Client findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public Client findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<Client> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Client> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
