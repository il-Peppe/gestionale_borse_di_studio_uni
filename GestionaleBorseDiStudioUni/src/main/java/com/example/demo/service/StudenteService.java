package com.example.demo.service;

import com.example.demo.dto.StudenteDto;

public interface StudenteService {
	StudenteDto getStudenteDtoById (StudenteDto studenteDto) throws Exception;
	StudenteDto addStudenteDto (StudenteDto studenteDto) throws Exception;
	StudenteDto updateStudenteDto (StudenteDto studenteDto) throws Exception;
	Integer deleteStudenteDtoById (Integer id) throws Exception;
	

}
