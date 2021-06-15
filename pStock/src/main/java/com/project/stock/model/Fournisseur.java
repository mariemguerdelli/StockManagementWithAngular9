package com.project.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name = "fournisseur")
public class Fournisseur {
    @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private long id;
      private String libelle;
      private String adresse;
      private String email;
      private String tel;
      private String login;
      private String  matfisc;
      private String pwd;
      private float   soldinit;
      private float   soldef;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getMatfisc() {
        return matfisc;
    }
    public void setMatfisc(String matfisc) {
        this.matfisc = matfisc;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public float getSoldinit() {
        return soldinit;
    }
    public void setSoldinit(float soldinit) {
        this.soldinit = soldinit;
    }
    public float getSoldef() {
        return soldef;
    }
    public void setSoldef(float soldef) {
        this.soldef = soldef;
    }
    public Fournisseur(long id, String code, String libelle, String adresse, String email, String tel, String login,
            String contact, String matfisc, String pwd, float soldinit, float soldef) {
        super();
        this.id = id;
        this.libelle = libelle;
        this.adresse = adresse;
        this.email = email;
        this.tel = tel;
        this.login = login;
        this.matfisc = matfisc;
        this.pwd = pwd;
        this.soldinit = soldinit;
        this.soldef = soldef;
    }
    public Fournisseur() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Fournisseur [id=" + id + ", libelle=" + libelle + ", adresse=" + adresse + ", email=" + email + ", tel="
                + tel + ", login=" + login + ", matfisc=" + matfisc + ", pwd=" + pwd + ", soldinit=" + soldinit
                + ", soldef=" + soldef + "]";
    }
    
    
      
}
