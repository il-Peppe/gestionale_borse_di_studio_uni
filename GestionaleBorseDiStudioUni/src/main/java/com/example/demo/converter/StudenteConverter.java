package com.example.demo.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.StudenteDto;
import com.example.demo.entity.Studente;

@Component
public class StudenteConverter {
	
	@Autowired
	BorsaDiStudioConverter borsaDiStudioConverter;
	
	public StudenteDto toDto(Studente input) {
		if (input == null) {
			return null;
		}
		StudenteDto output = new StudenteDto();
		output.setId(input.getId());
		output.setNome(input.getNome());
		output.setCognome(input.getCognome());
		output.setErasmus(input.getErasmus());
		output.setIsee(input.getIsee());
		output.setMatricola(input.getMatricola());
		output.setMediaVoti(input.getMediaVoti());
		output.setBorsaDiStudioDto(borsaDiStudioConverter.toEntity(input.getBorsaDiStudio()));
		return output;
		
		}
	
	public Studente toEntity(StudenteDto input) {
		if (input == null) {
			return null;
		}
		Studente output = new Studente();
		output.setId(input.getId());
		output.setNome(input.getNome());
		output.setCognome(input.getCognome());
		output.setErasmus(input.getErasmus());
		output.setIsee(input.getIsee());
		output.setMatricola(input.getMatricola());
		output.setMediaVoti(input.getMediaVoti());
		output.setBorsaDiStudio(borsaDiStudioConverter.toDto(input.getBorsaDiStudioDto()));
		return output;
		
		}

}
