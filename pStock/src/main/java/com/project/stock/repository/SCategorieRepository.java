package com.project.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stock.model.Scategorie;

@Repository

 

    public interface SCategorieRepository extends JpaRepository<Scategorie, Long>  {

 

    }
