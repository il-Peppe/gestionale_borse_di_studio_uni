package com.example.demo.converter;

import org.springframework.stereotype.Component;

import com.example.demo.dto.TipologiaBorsaDto;
import com.example.demo.entity.TipologiaBorsa;

@Component
public class TipologiaBorsaConverter {
	
	public TipologiaBorsaDto toDto(TipologiaBorsa input) {
	if (input == null) {
		return null;
	}
	TipologiaBorsaDto output = new TipologiaBorsaDto();
	output.setId(input.getId());
	output.setMediaMinima(input.getMediaMinima());
	output.setModalitaErogazione(input.getModalitaErogazione());
	output.setNomeTipologia(input.getNomeTipologia());
	output.setSogliaIsee(input.getSogliaIsee());
	return output;
	
	}
	public TipologiaBorsa toEntity(TipologiaBorsaDto input) {
		if (input == null) {
			return null;
		}
		TipologiaBorsa output = new TipologiaBorsa();
		output.setId(input.getId());
		output.setMediaMinima(input.getMediaMinima());
		output.setModalitaErogazione(input.getModalitaErogazione());
		output.setNomeTipologia(input.getNomeTipologia());
		output.setSogliaIsee(input.getSogliaIsee());
		return output;
	}
}
