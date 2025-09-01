package com.example.demo.service;

import com.example.demo.dto.DomandaBorsaDiStudioDto;

public interface DomandaBorsaDiStudioService {
	
	DomandaBorsaDiStudioDto getDomandaBorsaDiStudioDtoById (Integer id) throws Exception;
	DomandaBorsaDiStudioDto addDomandaBorsaDiStudioDto (DomandaBorsaDiStudioDto borsaDiStudioDto) throws Exception;
	DomandaBorsaDiStudioDto updateDomandaBorsaDiStudioDto (DomandaBorsaDiStudioDto borsaDiStudioDto) throws Exception;
	Integer deleteDomandaBorsaDiStudioDtoById (Integer id) throws Exception;

}
