package com.project.stock.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 

import com.fasterxml.jackson.annotation.JsonBackReference;

 

@Entity
@Table(name = "lcommande")
public class Lcomm {
    @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private long id;
      @Column(name="numero")
      private int numero ;
      private String code_article;
      private String libelle;
      private int pu;
      private double qte;
      private int tva;
      private double totht;
      private double tottva;
      private double totttc;
      @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
      @JsonBackReference
      private Comm comm;
    public Lcomm() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Lcomm(long id, int numero, String code_article, String libelle, int pu, double qte, int tva, double totht,
            double tottva, double totttc, Comm comm) {
        super();
        this.id = id;
        this.numero = numero;
        this.code_article = code_article;
        this.libelle = libelle;
        this.pu = pu;
        this.qte = qte;
        this.tva = tva;
        this.totht = totht;
        this.tottva = tottva;
        this.totttc = totttc;
        this.comm = comm;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCode_article() {
        return code_article;
    }
    public void setCode_article(String code_article) {
        this.code_article = code_article;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public int getPu() {
        return pu;
    }
    public void setPu(int pu) {
        this.pu = pu;
    }
    public double getQte() {
        return qte;
    }
    public void setQte(double qte) {
        this.qte = qte;
    }
    public int getTva() {
        return tva;
    }
    public void setTva(int tva) {
        this.tva = tva;
    }
    public double getTotht() {
        return totht;
    }
    public void setTotht(double totht) {
        this.totht = totht;
    }
    public double getTottva() {
        return tottva;
    }
    public void setTottva(double tottva) {
        this.tottva = tottva;
    }
    public double getTotttc() {
        return totttc;
    }
    public void setTotttc(double totttc) {
        this.totttc = totttc;
    }
    public Comm getComm() {
        return comm;
    }
    public void setComm(Comm comm) {
        this.comm = comm;
    }
    @Override
    public String toString() {
        return "Lcomm [id=" + id + ", numero=" + numero + ", code_article=" + code_article + ", libelle=" + libelle
                + ", pu=" + pu + ", qte=" + qte + ", tva=" + tva + ", totht=" + totht + ", tottva=" + tottva
                + ", totttc=" + totttc + ", comm=" + comm + "]";
    }
    
    
      
      
      
      }
