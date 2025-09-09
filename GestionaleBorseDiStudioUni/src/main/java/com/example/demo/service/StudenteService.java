package com.example.demo.service;

import com.example.demo.dto.BorsaDiStudioDto;
import com.example.demo.dto.StudenteDto;
import com.example.demo.entity.BorsaDiStudio;

public interface StudenteService {
	StudenteDto getStudenteDtoById (Integer id) throws Exception;
	void addStudenteDto (StudenteDto studenteDto, BorsaDiStudioDto borsaDiStudio) throws Exception;
	void updateStudenteDto (StudenteDto studenteDto) throws Exception;
	Integer deleteStudenteDtoById (Integer id) throws Exception;
	

}
