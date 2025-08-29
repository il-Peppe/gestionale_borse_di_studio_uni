package com.example.demo.dto;

import java.io.Serializable;
import java.sql.Date;

import com.example.demo.entity.BorsaDiStudio;
import com.example.demo.entity.Studente;

public class DomandaBorsaDiStudioDto implements Serializable {
	
	private int id;
	private StudenteDto studenteDto;
	private BorsaDiStudioDto borsaDiStudioDto;
	private Date dataInvio;
	private String universitaEstera;
	private Date dataInizioSoggiornoEstero;
	private Date dataFineSoggiornoEstero;
	
	public DomandaBorsaDiStudioDto() {
	}

	public DomandaBorsaDiStudioDto(int id, Date dataInvio) {
		this.id = id;
		this.dataInvio = dataInvio;
	}

	public DomandaBorsaDiStudioDto(int id, StudenteDto studenteDto, BorsaDiStudioDto borsaDiStudioDto, Date dataInvio,
			String universitaEstera, Date dataInizioSoggiornoEstero, Date dataFineSoggiornoEstero) {
		this.id = id;
		this.studenteDto = studenteDto;
		this.borsaDiStudioDto = borsaDiStudioDto;
		this.dataInvio = dataInvio;
		this.universitaEstera = universitaEstera;
		this.dataInizioSoggiornoEstero = dataInizioSoggiornoEstero;
		this.dataFineSoggiornoEstero = dataFineSoggiornoEstero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudenteDto getStudenteDto() {
		return studenteDto;
	}

	public void setStudenteDto(StudenteDto studenteDto) {
		this.studenteDto = studenteDto;
	}

	public BorsaDiStudioDto getBorsaDiStudioDto() {
		return borsaDiStudioDto;
	}

	public void setBorsaDiStudioDto(BorsaDiStudioDto borsaDiStudioDto) {
		this.borsaDiStudioDto = borsaDiStudioDto;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public String getUniversitaEstera() {
		return universitaEstera;
	}

	public void setUniversitaEstera(String universitaEstera) {
		this.universitaEstera = universitaEstera;
	}

	public Date getDataInizioSoggiornoEstero() {
		return dataInizioSoggiornoEstero;
	}

	public void setDataInizioSoggiornoEstero(Date dataInizioSoggiornoEstero) {
		this.dataInizioSoggiornoEstero = dataInizioSoggiornoEstero;
	}

	public Date getDataFineSoggiornoEstero() {
		return dataFineSoggiornoEstero;
	}

	public void setDataFineSoggiornoEstero(Date dataFineSoggiornoEstero) {
		this.dataFineSoggiornoEstero = dataFineSoggiornoEstero;
	}
	

}
