package com.example.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TipologiaBorsaDto;
import com.example.demo.service.TipologiaBorsaService;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;

@RestController
@RequestMapping("/tipologie_borse")
public class TipologiaBorsaControllerRest {
	
	@Autowired
	TipologiaBorsaService tipologiaBorsaService;
	@PostMapping("/cerca_tipologia/api")
	public ResponseEntity<String> cercaTipologia(@RequestBody TipologiaBorsaDto tipologiaBorsaDto ){
		try {
			TipologiaBorsaDto cercaTipologia = tipologiaBorsaService.getTipologiaBorsaDtoById(tipologiaBorsaDto.getId());
			String tipologiaTrovata = cercaTipologia.toString();
			return ResponseEntity.ok("Tipologia trovata: " + tipologiaTrovata);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Errore nella ricerca: " + e.getMessage());
		}
	}
	
	
	
	@PostMapping("/crea_nuova_tipologia/api")
	public ResponseEntity<String> creaTipologia(@RequestBody TipologiaBorsaDto tipologiaBorsaDto ){
		try {
			tipologiaBorsaService.addTipologiaBorsaDto(tipologiaBorsaDto);
			return ResponseEntity.ok("Tipologia borsa aggiunta!");
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Errore durante la creazione: " + e.getMessage());
		}
	}
	
	@PutMapping("/aggiorna_tipologia/api")
	public ResponseEntity<String> updateTipologia(@RequestBody TipologiaBorsaDto tipologiaBorsaDto ){
		try {
			tipologiaBorsaService.updateTipologiaBorsaDto(tipologiaBorsaDto);
			return ResponseEntity.ok("Tipologia borsa aggiornata!");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Errore durante l'aggiornamento: " + e.getMessage());
			
		}
	}
	@DeleteMapping("/elimina_tipologia/{id}/api")
	public ResponseEntity<String> deleteTipologia(@PathVariable Integer id) {
		
		try {
			tipologiaBorsaService.deleteTipologiaBorsaDtoById(id);
			return ResponseEntity.ok("Tipologia borsa eliminata");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Errore durante l'eliminazione: " + e.getMessage());
		}
	}
	
}


