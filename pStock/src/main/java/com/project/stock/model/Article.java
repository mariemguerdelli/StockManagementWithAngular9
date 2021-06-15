package com.project.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  private String libelle;
	  private float pa;
	  private int tva;
	  private int fodec;
	  private float pv;
	  private float stk_init;
	  private float stock;
	  private long code_cat;
	  private long code_scat;
	  private String filename;
	
	  
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
	public float getPa() {
		return pa;
	}
	public void setPa(float pa) {
		this.pa = pa;
	}
	public int getTva() {
		return tva;
	}
	public void setTva(int tva) {
		this.tva = tva;
	}
	public int getFodec() {
		return fodec;
	}
	public void setFodec(int fodec) {
		this.fodec = fodec;
	}
	
	public float getPv() {
		return pv;
	}
	public void setPv(float pv) {
		this.pv = pv;
	}
	public float getStk_init() {
		return stk_init;
	}
	public void setStk_init(float stk_init) {
		this.stk_init = stk_init;
	}
	public float getStock() {
		return stock;
	}
	public void setStock(float stock) {
		this.stock = stock;
	}
	
	

	public long getCode_cat() {
		return code_cat;
	}
	public void setCode_cat(long code_cat) {
		this.code_cat = code_cat;
	}
	public long getCode_scat() {
		return code_scat;
	}
	public void setCode_scat(long code_scat) {
		this.code_scat = code_scat;
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Article(long id, String code, String libelle, float pa, int tva, int fodec, int dc, float pv, float stk_init,
			float stock, String image, long code_cat, long code_scat, String filename) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.pa = pa;
		this.tva = tva;
		this.fodec = fodec;
		this.pv = pv;
		this.stk_init = stk_init;
		this.stock = stock;
		this.code_cat = code_cat;
		this.code_scat = code_scat;
		this.filename = filename;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", libelle=" + libelle + ", pa=" + pa + ", tva=" + tva
				+ ", fodec=" + fodec + ", pv=" + pv + ", stk_init=" + stk_init + ", stock=" + stock + ", code_cat="
				+ code_cat + ", code_scat=" + code_scat + ", filename=" + filename + "]";
	}
	
	 

}
	