package com.project.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stock.model.Fournisseur;


@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long>  {
	
}