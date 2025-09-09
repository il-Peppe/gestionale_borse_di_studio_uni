package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.converter.TipologiaBorsaConverter;
import com.example.demo.dto.BorsaDiStudioDto;
import com.example.demo.dto.StudenteDto;
import com.example.demo.dto.TipologiaBorsaDto;
import com.example.demo.entity.BorsaDiStudio;
import com.example.demo.entity.Studente;
import com.example.demo.entity.TipologiaBorsa;
import com.example.demo.repository.TipologiaBorseRepository;
import com.example.demo.service.TipologiaBorsaService;

@Service
public class TipologiaBorsaServiceImpl implements TipologiaBorsaService  {
	
	@Autowired
	TipologiaBorseRepository tipologiaBorseRepository;
	@Autowired
	TipologiaBorsaConverter tipologiaBorsaConverter;
	
	

	@Override
	public TipologiaBorsaDto getTipologiaBorsaDtoById(Integer id) throws Exception {
		
		Optional<TipologiaBorsa> ricercaTipoBorsa = tipologiaBorseRepository.findById(id);
		if(ricercaTipoBorsa.isPresent()) {
			TipologiaBorsa tipoborsaTrovata = ricercaTipoBorsa.get();
			TipologiaBorsaDto borsaTrovataDto =tipologiaBorsaConverter.toDto(tipoborsaTrovata);
			return borsaTrovataDto;
		}
			else {
				throw new RuntimeException("Errore : Tipologia borsa di studio non trovata con id :" + ricercaTipoBorsa );
			}
	}


	@Override
	public void addTipologiaBorsaDto(TipologiaBorsaDto tipologiaBorsaDto) throws Exception {
		try {
			
			TipologiaBorsa entityTipologiaBorsa = tipologiaBorsaConverter.toEntity(tipologiaBorsaDto);
			tipologiaBorseRepository.save(entityTipologiaBorsa);
			tipologiaBorseRepository.flush();
			
			
		} catch (Exception e) {
			throw new RuntimeException("Errore" + e.getMessage());
		}
	}
	@Override
	public void updateTipologiaBorsaDto(TipologiaBorsaDto tipologiaBorsaDto) throws Exception {
	try {
			
			TipologiaBorsa entityTipologiaBorsa = tipologiaBorsaConverter.toEntity(tipologiaBorsaDto);
			tipologiaBorseRepository.save(entityTipologiaBorsa);
			tipologiaBorseRepository.flush();
			
			
		} catch (Exception e) {
			throw new RuntimeException("Errore" + e.getMessage());
		}
		
	}

	@Override
	public Integer deleteTipologiaBorsaDtoById(Integer id) throws Exception {
		try {
		tipologiaBorseRepository.deleteById(id);
	} catch (Exception e) {
		throw new RuntimeException("Errore" + e.getMessage());
	}
	return id;
		}


	@Override
	public Page<TipologiaBorsaDto> tipologieInPage(Integer id, String nomeTipologia, Integer sogliaIsee,
			Integer mediaMinima, String modalitaErogazione, int page, int size, String sortBy, String sortDirection) {
		Pageable pageable = PageRequest.of(page, size, (Sort.by(Sort.Direction.fromString(sortDirection.toUpperCase()), sortBy)));
		Page<TipologiaBorsa> paginaTipologieInOrdineCrescente = tipologiaBorseRepository.searchByParam(id, nomeTipologia, pageable);
		List<TipologiaBorsaDto> listaTipologieDto = new ArrayList<TipologiaBorsaDto>();
		for (TipologiaBorsa tipologiaBorsa : paginaTipologieInOrdineCrescente.getContent()) {
			TipologiaBorsaDto dto = new TipologiaBorsaDto();
			dto.setId(tipologiaBorsa.getId());
			dto.setMediaMinima(tipologiaBorsa.getMediaMinima());
			dto.setModalitaErogazione(tipologiaBorsa.getModalitaErogazione());
			dto.setNomeTipologia(tipologiaBorsa.getNomeTipologia());
			dto.setSogliaIsee(tipologiaBorsa.getSogliaIsee());
			listaTipologieDto.add(dto);
		}
		return new PageImpl<TipologiaBorsaDto>(listaTipologieDto, pageable, paginaTipologieInOrdineCrescente.getTotalElements());
	}



	}


