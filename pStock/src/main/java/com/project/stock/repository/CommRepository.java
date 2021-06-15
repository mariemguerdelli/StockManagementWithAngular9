package com.project.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

import com.project.stock.model.Comm;
@Repository
public interface CommRepository extends JpaRepository<Comm, Long>{

 

}



