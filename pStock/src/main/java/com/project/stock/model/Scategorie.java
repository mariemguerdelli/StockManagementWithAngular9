package com.project.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scategorie")
public class Scategorie {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  private String libelle;
	  private long id_cat;
	  
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public long getId_cat() {
		return id_cat;
	}
	public void setId_cat(long id_cat) {
		this.id_cat = id_cat;
	}
	public Scategorie(long id, String code, String libelle, long id_cat) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.id_cat = id_cat;
	}
	public Scategorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Scategorie [id=" + id + ", code=" + code + ", libelle=" + libelle + ", id_cat=" + id_cat + "]";
	}
	
	  
	  
	  
	  
}