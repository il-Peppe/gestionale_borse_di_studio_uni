package com.example.demo.service;

import com.example.demo.dto.TipologiaBorsaDto;

public interface TipologiaBorsaService {

	TipologiaBorsaDto getTipologiaBorsaDtoById (Integer id) throws Exception;
	TipologiaBorsaDto addTipologiaBorsaDto (TipologiaBorsaDto tipologiaBorsaDto) throws Exception;
	TipologiaBorsaDto updateTipologiaBorsaDto (TipologiaBorsaDto tipologiaBorsaDto) throws Exception;
	Integer deleteTipologiaBorsaDtoById (Integer id) throws Exception;
}
