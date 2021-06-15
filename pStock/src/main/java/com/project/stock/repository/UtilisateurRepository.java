package com.project.stock.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.stock.model.Utilisateur;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	
	Optional<Utilisateur> findByLogin(String login);
	
}