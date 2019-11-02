package com.stock.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MvtStock implements Serializable {
	public static final int ENTREE = 1;
	public static final int SORTIE = 0;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idMvtStock;
	
	private Date createdAt;
	
	private int quantite;
	
	private int type;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public MvtStock() {
		super();
	}

	public long getIdMvtStock() {
		return idMvtStock;
	}

	public void setIdMvtStock(long idMvtStock) {
		this.idMvtStock = idMvtStock;
	}
	
	
	
	
	
}
