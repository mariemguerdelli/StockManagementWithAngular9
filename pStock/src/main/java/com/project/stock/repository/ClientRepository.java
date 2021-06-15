package com.project.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stock.model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {
	
}
