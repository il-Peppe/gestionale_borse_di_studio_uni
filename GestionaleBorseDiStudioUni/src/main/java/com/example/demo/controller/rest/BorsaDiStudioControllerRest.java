package com.example.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BorsaDiStudioDto;
import com.example.demo.dto.TipologiaBorsaDto;
import com.example.demo.entity.TipologiaBorsa;
import com.example.demo.service.BorsaDiStudioService;

@RestController
@RequestMapping("/Borse_Di_Studio")
public class BorsaDiStudioControllerRest {
	
	@Autowired
	BorsaDiStudioService borsaDiStudioService;
	
	@PostMapping("/crea_nuova_borsa_di_studio/api")
	public ResponseEntity<String> creaStudente(@RequestBody BorsaDiStudioDto borsaDiStudioDto, TipologiaBorsaDto tipologiaBorsaDto){
		try {
			borsaDiStudioService.addBorsaDiStudioDto(borsaDiStudioDto);
			return ResponseEntity.ok("Borsa di studio aggiunta!");
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Errore durante la creazione: " + e.getMessage());
		}
	}
}
