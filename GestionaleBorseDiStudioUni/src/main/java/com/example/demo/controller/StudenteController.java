package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.StudenteDto;
import com.example.demo.service.StudenteService;

@Controller
@RequestMapping("/Studente")
public class StudenteController {
	@Autowired
	StudenteService studenteService; 
	
	@GetMapping("/home_ricerca_studente")
    public String mostraPaginaRicercaSudente() {
        return "ricerca_studente";
    } 
	
	@GetMapping("/ricerca_studente")
	public String cercaStudente(@RequestParam(required = false) Integer id, Model model) {
		
		try {
			StudenteDto sudenteDto = studenteService.getStudenteDtoById(id);
			model.addAttribute("Studente", sudenteDto);
			
		} catch (Exception e) {
			model.addAttribute("ErrorMessage", "Studente non trovato con id:" + id);
			return "ricerca_studente";
		}
		return "studente_trovato";
	}
	
	

}
