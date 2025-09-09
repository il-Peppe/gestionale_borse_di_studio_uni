package com.example.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BorsaDiStudioDto;
import com.example.demo.dto.StudenteDto;
import com.example.demo.service.StudenteService;

@RestController
@RequestMapping("/Studenti")
public class StudenteControllerRest {
	
	@Autowired
	StudenteService studenteService;
	
	@GetMapping("/cerca_Studente_con_id/api")
	public StudenteDto cercaStudente(@RequestParam Integer id){
		try {
			
			return studenteService.getStudenteDtoById(id);
			
		} catch (Exception e) {
			return null;
		}
		
	}
	

	@PostMapping("/crea_Studente/api")
	public ResponseEntity<String> creaStudente(@RequestBody  StudenteDto studenteDto,
			 BorsaDiStudioDto borsaDiStudioDto){
		try {
			studenteService.addStudenteDto(studenteDto, borsaDiStudioDto);
			return ResponseEntity.ok("Studente aggiunto!");
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Errore durante la creazione: " + e.getMessage());
		}
	}
		
		@PostMapping("/update_Studente/api")
		public ResponseEntity<String> updateStudente(@RequestBody  StudenteDto studenteDto,
				 BorsaDiStudioDto borsaDiStudioDto){
			try {
				studenteService.updateStudenteDto(studenteDto);
				return ResponseEntity.ok("Studente aggiunto!");
				
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Errore durante la creazione: " + e.getMessage());
			}
		
	}
}
