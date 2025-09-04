package com.example.demo.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.DomandaBorsaDiStudioDto;
import com.example.demo.entity.DomandaBorsaDiStudio;

@Component
public class DomandaBorsaDiStudioConverter {
	
	@Autowired
	BorsaDiStudioConverter borsaDiStudioConverter;
	@Autowired
	StudenteConverter studenteConverter;
	
	
	public DomandaBorsaDiStudioDto toDto(DomandaBorsaDiStudio input) {
		if (input == null) {
			return null;
		}
		DomandaBorsaDiStudioDto output = new DomandaBorsaDiStudioDto();
		output.setId(input.getId());
		output.setDataInvio(input.getDataInvio());
		output.setBorsaDiStudioDto(borsaDiStudioConverter.toDto(input.getBorsaDiStudio()));
		output.setStudenteDto(studenteConverter.toDto(input.getStudente()));
		output.setDataInizioSoggiornoEstero(input.getDataInizioSoggiornoEstero());
		output.setDataFineSoggiornoEstero(input.getDataFineSoggiornoEstero());
		output.setUniversitaEstera(input.getUniversitaEstera());
		return output;
		
	}
	
	public DomandaBorsaDiStudio toEntity(DomandaBorsaDiStudioDto input) {
		if (input == null) {
			return null;
		}
		DomandaBorsaDiStudio output = new DomandaBorsaDiStudio();
		output.setId(input.getId());
		output.setDataInvio(input.getDataInvio());
		output.setBorsaDiStudio(borsaDiStudioConverter.toEntity(input.getBorsaDiStudioDto()));
		output.setStudente(studenteConverter.toEntity(input.getStudenteDto()));
		output.setDataInizioSoggiornoEstero(input.getDataInizioSoggiornoEstero());
		output.setDataFineSoggiornoEstero(input.getDataFineSoggiornoEstero());
		output.setUniversitaEstera(input.getUniversitaEstera());
		return output;
		
	}

}
