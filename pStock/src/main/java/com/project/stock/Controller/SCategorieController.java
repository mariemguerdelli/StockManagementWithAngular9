package com.project.stock.Controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.awt.PageAttributes.MediaType;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.project.stock.exception.ResourceNotFoundException;
import com.project.stock.model.Categorie;
import com.project.stock.model.Scategorie;
import com.project.stock.repository.SCategorieRepository;





@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class SCategorieController {
	@Autowired 	SCategorieRepository  repository;
	//@Autowired 	SCategorieRepository  scatrepository;
	//@Autowired  ServletContext context;
	
	 @GetMapping("/scategories")
	  public List<Scategorie> getAllscategories() {
	     System.out.println("Get all scategories...");
	 
	    List<Scategorie> scategories = new ArrayList<>();
	    repository.findAll().forEach(scategories::add);
	 
	    return scategories;
	  }
	 
	 @GetMapping("/scategories/{id}")
		public ResponseEntity<Scategorie> getscategorieById(@PathVariable(value = "id") Long Id)
				throws ResourceNotFoundException {
			Scategorie scategorie = repository.findById(Id)
					.orElseThrow(() -> new ResourceNotFoundException("scategorie not found for this id :: " + Id));
			return ResponseEntity.ok().body(scategorie);
		}
	 
	 
	 @PostMapping("/scategories")
		public Scategorie createSCategorie(@Valid @RequestBody Scategorie Scategorie) {
			return repository.save(Scategorie);
			
		}
	 
	@DeleteMapping("/scategories/{id}")
	public Map<String, Boolean> deletescategorie(@PathVariable(value = "id") Long scategorieId)
			throws ResourceNotFoundException {
		Scategorie scategorie = repository.findById(scategorieId)
				.orElseThrow(() -> new ResourceNotFoundException("Article not found  id :: " + scategorieId));
		repository.delete(scategorie);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  	 
	@DeleteMapping("/scategories/delete")
	  public ResponseEntity<String> deleteAllscategories() {
	    System.out.println("Delete All scategories...");
	    repository.deleteAll();
	    return new ResponseEntity<>("All scategories have been deleted!", HttpStatus.OK);
	}

	  @PutMapping("/scategories/{id}")
	  public ResponseEntity<Scategorie> updatescategorie(@PathVariable("id") long id, @RequestBody Scategorie Scategorie) {
	    System.out.println("Update scategorie with ID = " + id + "...");
	    Optional<Scategorie> scategorieInfo = repository.findById(id);
	    if (scategorieInfo.isPresent()) {
	    	Scategorie scategorie = scategorieInfo.get();
	    	scategorie.setCode(Scategorie.getCode());
	    	scategorie.setLibelle(Scategorie.getLibelle());
	    	scategorie.setId_cat(Scategorie.getId_cat());
		    
	   
	          
	      return new ResponseEntity<>(repository.save(Scategorie), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}

