package com.stock.services;

import java.util.List;

import com.stock.entities.Article;

public interface IArticleService {
	public Article save(Article entity);
	
	public Article update(Article entity);
	
	public void remove(Long id);
	
	public Article findOneById(Long id);
	
	public Article findOneBy(String field, Object value); 
	
	public Article findOneBy(String[] fields, Object[] values);
	
	public List<Article> findAll();
	
	public List<Article> findAllSortedBy(String field, String order);
	
	public int countBy(String field, String value);
}
