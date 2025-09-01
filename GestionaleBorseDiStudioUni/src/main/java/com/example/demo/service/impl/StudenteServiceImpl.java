package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.StudenteConverter;
import com.example.demo.dto.StudenteDto;
import com.example.demo.entity.Studente;
import com.example.demo.repository.StudenteRepository;
import com.example.demo.service.StudenteService;

@Service
public class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	StudenteRepository studenteRepository;
	@Autowired
	StudenteConverter studenteConverter;

	@Override
	public StudenteDto getStudenteDtoById(StudenteDto studenteDto) throws Exception {
		return null;
		
	}

	@Override
	public StudenteDto addStudenteDto(StudenteDto studenteDto) throws Exception {
		try {
			Studente entityStudente = studenteConverter.toEntity(studenteDto);
			Studente newStudenteSalvato = studenteRepository.save(entityStudente);
			return studenteConverter.toDto(newStudenteSalvato);
		} catch (Exception e) {
			throw new RuntimeException("Errore" + e.getMessage());
		}
	}

	@Override
	public StudenteDto updateStudenteDto(StudenteDto studenteDto) throws Exception {
		try {
			Studente entityStudente = studenteConverter.toEntity(studenteDto);
			Studente StudenteSalvatoUpdated = studenteRepository.save(entityStudente);
			return studenteConverter.toDto(StudenteSalvatoUpdated);
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
