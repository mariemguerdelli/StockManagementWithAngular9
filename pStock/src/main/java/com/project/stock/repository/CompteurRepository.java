package com.project.stock.repository;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

import com.project.stock.model.Compteur;
@Repository
public interface CompteurRepository extends JpaRepository<Compteur, Long>{

 

    
    Optional<Compteur> findByAnnee(int annee);

 

}