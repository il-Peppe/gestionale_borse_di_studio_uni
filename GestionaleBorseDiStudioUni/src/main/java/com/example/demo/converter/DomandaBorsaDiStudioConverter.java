package com.example.demo.converter;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.DomandaBorsaDiStudioDto;
import com.example.demo.entity.DomandaBorsaDiStudio;

public class DomandaBorsaDiStudioConverter {
	
	@Autowired
	BorsaDiStudioConverter borsaDiStudioConverter;
	@Autowired
	StudenteConverter studenteConverter;
	
	
	public DomandaBorsaDiStudioDto toEntity(DomandaBorsaDiStudio input) {
		if (input == null) {
			return null;
		}
		DomandaBorsaDiStudioDto output = new DomandaBorsaDiStudioDto();
		output.setId(input.getId());
		output.setDataInvio(input.getDataInvio());
		output.setBorsaDiStudioDto(borsaDiStudioConverter.toEntity(input.getBorsaDiStudio()));
		output.setStudenteDto(studenteConverter.toEntity(input.getStudente()));
		output.setDataInizioSoggiornoEstero(input.getDataInizioSoggiornoEstero());
		output.setDataFineSoggiornoEstero(input.getDataFineSoggiornoEstero());
		output.setUniversitaEstera(input.getUniversitaEstera());
		return output;
		
	}
	
	public DomandaBorsaDiStudio toDto(DomandaBorsaDiStudioDto input) {
		if (input == null) {
			return null;
		}
		DomandaBorsaDiStudio output = new DomandaBorsaDiStudio();
		output.setId(input.getId());
		output.setDataInvio(input.getDataInvio());
		output.setBorsaDiStudio(borsaDiStudioConverter.toDto(input.getBorsaDiStudioDto()));
		output.setStudente(studenteConverter.toDto(input.getStudenteDto()));
		output.setDataInizioSoggiornoEstero(input.getDataInizioSoggiornoEstero());
		output.setDataFineSoggiornoEstero(input.getDataFineSoggiornoEstero());
		output.setUniversitaEstera(input.getUniversitaEstera());
		return output;
		
	}

}
