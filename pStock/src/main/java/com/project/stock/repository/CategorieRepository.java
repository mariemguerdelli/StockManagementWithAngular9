package com.project.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stock.model.Categorie;


@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>  {
	
}