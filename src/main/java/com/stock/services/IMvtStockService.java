package com.stock.services;

import java.util.List;

import com.stock.entities.MvtStock;

public interface IMvtStockService {
	public MvtStock save(MvtStock entity);
	
	public MvtStock update(MvtStock entity);
	
	public void remove(Long id);
	
	public MvtStock findOneById(Long id);
	
	public MvtStock findOneBy(String field, Object value); 
	
	public MvtStock findOneBy(String[] fields, Object[] values);
	
	public List<MvtStock> findAll();
	
	public List<MvtStock> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
