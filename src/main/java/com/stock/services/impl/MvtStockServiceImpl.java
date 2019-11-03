package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.IMvtStockDao;
import com.stock.dao.impl.MvtStockDaoImpl;
import com.stock.entities.MvtStock;
import com.stock.services.IMvtStockService;

@Transactional
public class MvtStockServiceImpl implements IMvtStockService{
	
	private IMvtStockDao dao;

	public MvtStockServiceImpl(MvtStockDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public MvtStock save(MvtStock entity) {
		return dao.save(entity);
	}

	@Override
	public MvtStock update(MvtStock entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public MvtStock findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public MvtStock findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public MvtStock findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<MvtStock> findAll() {
		return dao.findAll();
	}

	@Override
	public List<MvtStock> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
