package com.project.stock.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

 

import javax.validation.Valid;

 

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RestController;

 

import com.project.stock.exception.ResourceNotFoundException;
import com.project.stock.model.Fournisseur;
import com.project.stock.model.Client;
import com.project.stock.repository.FournisseurRepository;

 

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FournisseurController {
    
    @Autowired     FournisseurRepository  repository;
    //@Autowired     SFournisseurRepository  scatrepository;
    //@Autowired  ServletContext context;
    
     @GetMapping("/fournisseurs")
      public List<Fournisseur> getAllFournisseurs() {
         System.out.println("Get all Fournisseurs...");
     
        List<Fournisseur> Fournisseurs = new ArrayList<>();
        repository.findAll().forEach(Fournisseurs::add);
     
        return Fournisseurs;
      }
     
     @GetMapping("/fournisseurs/{id}")
        public ResponseEntity<Fournisseur> getFournisseurById(@PathVariable(value = "id") Long Id)
                throws ResourceNotFoundException {
            Fournisseur Fournisseur = repository.findById(Id)
                    .orElseThrow(() -> new ResourceNotFoundException("Fournisseur not found for this id :: " + Id));
            return ResponseEntity.ok().body(Fournisseur);
        }
     
     @PostMapping("/fournisseurs")
        public Fournisseur createFournisseur(@Valid @RequestBody Fournisseur Fournisseur) {
            return repository.save(Fournisseur);
        }
      
    
    @DeleteMapping("/fournisseurs/{id}")
    public Map<String, Boolean> deleteFournisseur(@PathVariable(value = "id") Long FournisseurId)
            throws ResourceNotFoundException {
        Fournisseur Fournisseur = repository.findById(FournisseurId)
                .orElseThrow(() -> new ResourceNotFoundException("Fournisseur not found  id :: " + FournisseurId));
        repository.delete(Fournisseur);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
           
    @DeleteMapping("/fournisseurs/delete")
      public ResponseEntity<String> deleteAllFournisseurs() {
        System.out.println("Delete All Fournisseurs...");
        repository.deleteAll();
        return new ResponseEntity<>("All Fournisseurs have been deleted!", HttpStatus.OK);
    }

 

      @PutMapping("/fournisseurs/{id}")
      public ResponseEntity<Fournisseur> updateFournisseur(@PathVariable("id") long id, @RequestBody Fournisseur Fournisseur) {
        System.out.println("Update fournisseur with ID = " + id + "...");
        Optional<Fournisseur> FournisseurInfo = repository.findById(id);
        if (FournisseurInfo.isPresent()) {
            Fournisseur fournisseur = FournisseurInfo.get();
               fournisseur.setLibelle(Fournisseur.getLibelle());
               fournisseur.setAdresse(Fournisseur.getAdresse());
               fournisseur.setEmail(Fournisseur.getEmail());
               fournisseur.setMatfisc(Fournisseur.getMatfisc());
               fournisseur.setPwd(Fournisseur.getPwd());
               fournisseur.setLogin(Fournisseur.getLogin());
               fournisseur.setTel(Fournisseur.getTel());
               fournisseur.setSoldinit(Fournisseur.getSoldinit());
               fournisseur.setSoldef(Fournisseur.getSoldef());

 

               
          return new ResponseEntity<>(repository.save(Fournisseur), HttpStatus.OK);
        } else {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
      }

 

}
 

