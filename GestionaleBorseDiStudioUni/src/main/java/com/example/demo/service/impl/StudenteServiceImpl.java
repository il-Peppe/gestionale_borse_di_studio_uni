package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.BorsaDiStudioConverter;
import com.example.demo.converter.StudenteConverter;
import com.example.demo.dto.BorsaDiStudioDto;
import com.example.demo.dto.StudenteDto;
import com.example.demo.entity.BorsaDiStudio;
import com.example.demo.entity.Studente;
import com.example.demo.repository.BorsaDiStudioRepository;
import com.example.demo.repository.StudenteRepository;
import com.example.demo.service.StudenteService;

@Service
public class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	StudenteRepository studenteRepository;
	@Autowired
	StudenteConverter studenteConverter;
	@Autowired
	BorsaDiStudioRepository borsaDiStudioRepository;
	@Autowired
	BorsaDiStudioConverter borsaDiStudioConverter;
	@Override
	public StudenteDto getStudenteDtoById(Integer id) throws Exception {
		try {
			
			
			Optional<Studente> studentericercato = studenteRepository.findById(id);
			if(studentericercato.isPresent()) {
				Studente studenteTrovata = studentericercato.get();
				StudenteDto studenteTrovatoDto = studenteConverter.toDto(studenteTrovata);
				return studenteTrovatoDto;
			}
				else {
					throw new RuntimeException("Errore : studente non trovato con id :" + studentericercato );
				}
			
		} catch (Exception e) {
			throw new RuntimeException("Errore" + e.getMessage());
		}
		
	}

	@Override
	public void addStudenteDto(StudenteDto studenteDto, BorsaDiStudioDto borsaDiStudioDto ) throws Exception {
		try {
			Studente entityStudenteInsert = studenteConverter.toEntity(studenteDto);
			studenteRepository.save(entityStudenteInsert);
			studenteRepository.flush();
			
			
		} catch (Exception e) {
			throw new RuntimeException("Errore" + e.getMessage());
		}
	}

	@Override
	public void updateStudenteDto(StudenteDto studenteDto) throws Exception {
		try {
			Studente entityStudenteUpdate = studenteConverter.toEntity(studenteDto);
			studenteRepository.save(entityStudenteUpdate);
			studenteRepository.flush();
		
		} catch (Exception e) {
			throw new RuntimeException("Errore" + e.getMessage());
		}
	}

	@Override
	public Integer deleteStudenteDtoById(Integer id) throws Exception {
		try {
			studenteRepository.deleteById(id);
		} catch (Exception e) {
			throw new RuntimeException("Errore" + e.getMessage());
		}
		return id;
	}

}
