package com.stock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {
	
	public Categorie() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCategorie;
	
	private String code;
	
	private String description;
	
	@OneToMany(mappedBy = "categorie")
	private List<Article> articles;
	
	public long getId() {
		return idCategorie;
	}

	public void setId(long id) {
		this.idCategorie = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
