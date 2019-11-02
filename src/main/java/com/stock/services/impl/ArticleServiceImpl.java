package com.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.IArticleDao;
import com.stock.dao.impl.ArticleDaoImpl;
import com.stock.entities.Article;
import com.stock.services.IArticleService;

@Transactional
public class ArticleServiceImpl implements IArticleService{
	
	private IArticleDao dao;
	
	/*
	public ArticleServiceImpl(ArticleDaoImpl dao) {
		this.dao = dao;
	}*/

	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article entity) {
		return dao.save(entity);
	}

	@Override
	public Article update(Article entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Article findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public Article findOneBy(String field, Object value) {
		return dao.findOneBy(field, value);
	}

	@Override
	public Article findOneBy(String[] fields, Object[] values) {
		return dao.findOneBy(fields, values);
	}

	@Override
	public List<Article> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Article> findAllSortedBy(String field, String order) {
		return dao.findAllSortedBy(field, order);
	}

	@Override
	public int countBy(String field, String value) {
		return dao.countBy(field, value);
	}

}
