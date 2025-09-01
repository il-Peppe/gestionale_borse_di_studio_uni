package com.example.demo.converter;

import com.example.demo.dto.TipologiaBorsaDto;
import com.example.demo.entity.TipologiaBorsa;

public class TipologiaBorsaConverter {
	
	public TipologiaBorsaDto toEntity(TipologiaBorsa input) {
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
	public TipologiaBorsa toDto(TipologiaBorsaDto input) {
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
