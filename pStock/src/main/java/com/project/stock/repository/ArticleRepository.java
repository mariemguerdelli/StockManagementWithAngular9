package com.project.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stock.model.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}