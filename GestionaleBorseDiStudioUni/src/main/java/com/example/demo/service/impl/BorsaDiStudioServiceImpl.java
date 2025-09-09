package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.converter.BorsaDiStudioConverter;
import com.example.demo.converter.TipologiaBorsaConverter;
import com.example.demo.dto.BorsaDiStudioDto;
import com.example.demo.dto.TipologiaBorsaDto;
import com.example.demo.entity.BorsaDiStudio;
import com.example.demo.entity.TipologiaBorsa;
import com.example.demo.repository.BorsaDiStudioRepository;
import com.example.demo.repository.TipologiaBorseRepository;
import com.example.demo.service.BorsaDiStudioService;
import com.example.demo.service.TipologiaBorsaService;

@Service
public class BorsaDiStudioServiceImpl implements BorsaDiStudioService {
	
	@Autowired
	BorsaDiStudioRepository borsaDiStudioRepository;
	@Autowired
	BorsaDiStudioConverter borsaDiStudioConverter;
	@Autowired
	TipologiaBorseRepository tipologiaBorseRepository;
	@Autowired
	TipologiaBorsaConverter tipologiaBorsaConverter;
	
	

	@Override
	public BorsaDiStudioDto getBorsaDiStudioDtoById(Integer id) throws Exception {
		
		Optional<BorsaDiStudio> ricercaBorsaDiStudio = borsaDiStudioRepository.findById(id);
		if(ricercaBorsaDiStudio.isPresent()) {
			BorsaDiStudio borsaTrovata = ricercaBorsaDiStudio.get();
			BorsaDiStudioDto borsaTrovataDto =borsaDiStudioConverter.toDto(borsaTrovata);
			return borsaTrovataDto;
		}
			else {
				throw new RuntimeException("Errore : borsa di studio non trovata con id :" + ricercaBorsaDiStudio );
			}
	}

	@Override
	@Transactional
	public void addBorsaDiStudioDto(BorsaDiStudioDto borsaDiStudioDto) throws Exception {
	
	}
	@Override
	public void updateBorsaDiStudioDto(BorsaDiStudioDto borsaDiStudioDto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer deleteBorsaDiStudioDtoById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
