package com.example.demo.service;

import org.springframework.data.domain.Page;

import com.example.demo.dto.TipologiaBorsaDto;

public interface TipologiaBorsaService {

	TipologiaBorsaDto getTipologiaBorsaDtoById (Integer id) throws Exception;
	void addTipologiaBorsaDto (TipologiaBorsaDto tipologiaBorsaDto) throws Exception;
	void updateTipologiaBorsaDto (TipologiaBorsaDto tipologiaBorsaDto) throws Exception;
	Integer deleteTipologiaBorsaDtoById (Integer id) throws Exception;
	Page<TipologiaBorsaDto> tipologieInPage (Integer id, String nomeTipologia, Integer sogliaIsee, Integer mediaMinima, String modalitaErogazione,
			int page, int size, String sortBy, String sortDirection);
}
