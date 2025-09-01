package com.example.demo.converter;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.BorsaDiStudioDto;
import com.example.demo.entity.BorsaDiStudio;

public class BorsaDiStudioConverter {
	
	@Autowired
	TipologiaBorsaConverter tipologiaBorsaConverter;
	
	
	public BorsaDiStudioDto toEntity(BorsaDiStudio input) {
		if (input == null) {
			return null;
		}
		BorsaDiStudioDto output = new BorsaDiStudioDto();
		output.setId(input.getId());
		output.setAnnoAccademico(input.getAnnoAccademico());
		output.setEnteFinanziario(input.getEnteFinanziario());
		output.setProgramma(input.getProgramma());
		output.setTipologiaBorsaDto(tipologiaBorsaConverter.toEntity(input.getTipologiaBorsa()));
		return output;
		
		}
	public BorsaDiStudio toDto(BorsaDiStudioDto input) {
		if (input == null) {
			return null;
		}
		BorsaDiStudio output = new BorsaDiStudio();
		output.setId(input.getId());
		output.setAnnoAccademico(input.getAnnoAccademico());
		output.setEnteFinanziario(input.getEnteFinanziario());
		output.setProgramma(input.getProgramma());
		output.setTipologiaBorsa(tipologiaBorsaConverter.toDto(input.getTipologiaBorsaDto()));
		return output;
		
		}

}
