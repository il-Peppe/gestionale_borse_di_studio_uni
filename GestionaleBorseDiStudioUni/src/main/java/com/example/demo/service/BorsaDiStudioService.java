package com.example.demo.service;

import com.example.demo.dto.BorsaDiStudioDto;

public interface BorsaDiStudioService {

	BorsaDiStudioDto getBorsaDiStudioDtoById (Integer id) throws Exception;
	void addBorsaDiStudioDto (BorsaDiStudioDto borsaDiStudioDto) throws Exception;
	void updateBorsaDiStudioDto (BorsaDiStudioDto borsaDiStudioDto) throws Exception;
	Integer deleteBorsaDiStudioDtoById (Integer id) throws Exception;

}
