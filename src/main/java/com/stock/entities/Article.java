package com.stock.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable {
	public Article() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idArticle;
	
	private String code;

	private String description;
	
	private BigDecimal prix;
	
	private BigDecimal tva;
	
	private BigDecimal ttc;
	
	private String photo;
	
	@OneToMany(mappedBy = "article")
	private List<LigneCommandeClient> lignCommandeClients;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;

	public long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}

	public String getCode() {
		return code;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
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

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public BigDecimal getTva() {
		return tva;
	}

	public void setTva(BigDecimal tva) {
		this.tva = tva;
	}

	public BigDecimal getTtc() {
		return ttc;
	}

	public void setTtc(BigDecimal ttc) {
		this.ttc = ttc;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
