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
import javax.validation.Valid;
import javax.servlet.ServletContext;
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

import com.project.stock.model.Client;

import com.project.stock.repository.ClientRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ClientController {
	@Autowired 	ClientRepository  repository;
	//@Autowired 	SCategorieRepository  scatrepository;
	//@Autowired  ServletContext context;
	

	
	 @GetMapping("/clients")
	  public List<Client> getAllClients() {
	    System.out.println("Get all Clients...");
	 
	    List<Client> Clients = new ArrayList<>();
	    repository.findAll().forEach(Clients::add);
	 
	    return Clients;
	  }
	
	 @GetMapping("/Clients/{id}")
		public ResponseEntity<Client> getClientById(@PathVariable(value = "id") Long Id)
				throws ResourceNotFoundException {
			Client Client = repository.findById(Id)
					.orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + Id));
			return ResponseEntity.ok().body(Client);
		}
	 
	 @PostMapping("/clients")
		public Client createClient(@Valid @RequestBody Client Client) {
			return repository.save(Client);
			
		}
	 
	 
	@DeleteMapping("/clients/{id}")
	public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long ClientId)
			throws ResourceNotFoundException {
		Client Client = repository.findById(ClientId)
				.orElseThrow(() -> new ResourceNotFoundException("Article not found  id :: " + ClientId));
		repository.delete(Client);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  	 
	@DeleteMapping("/clients/delete")
	  public ResponseEntity<String> deleteAllclients() {
	    System.out.println("Delete All clients...");
	    repository.deleteAll();
	    return new ResponseEntity<>("All clients have been deleted!", HttpStatus.OK);
	}

	  @PutMapping("/clients/{id}")
	  public ResponseEntity<Client> updateClient(@PathVariable("id") long id, @RequestBody Client Client) {
	    System.out.println("Update Client with ID = " + id + "...");
	    Optional<Client> ClientInfo = repository.findById(id);
	    if (ClientInfo.isPresent()) {
	    	Client client = ClientInfo.get();
	    	client.setLibelle(Client.getLibelle());
	    	client.setAdresse(Client.getAdresse());
	    	client.setEmail(Client.getEmail());
	    	client.setLogin(Client.getLogin());
	    	client.setPwd(Client.getPwd());
	    	client.setTel(Client.getTel());
	    	client.setFax(Client.getFax());
	    	
	          
	      return new ResponseEntity<>(repository.save(Client), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}

