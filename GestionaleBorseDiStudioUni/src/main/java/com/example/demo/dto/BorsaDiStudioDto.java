package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.entity.DomandaBorsaDiStudio;
import com.example.demo.entity.Studente;

public class BorsaDiStudioDto implements Serializable {
	
	private Integer id;
	private TipologiaBorsaDto tipologiaBorsaDto;
	private String programma;
	private String enteFinanziario;
	private String annoAccademico;
	private DomandaBorsaDiStudio domandaBorsaDiStudio;
	private Studente studente;
	
	public BorsaDiStudioDto() {
	}
	
	public BorsaDiStudioDto(Integer id, String programma, String enteFinanziario, String annoAccademico) {
		this.id = id;
		this.programma = programma;
		this.enteFinanziario = enteFinanziario;
		this.annoAccademico = annoAccademico;
	}
	
	public BorsaDiStudioDto(Integer id, TipologiaBorsaDto tipologiaBorsaDto, String programma, String enteFinanziario,
			String annoAccademico, DomandaBorsaDiStudio domandaBorsaDiStudio, Studente studente) {
		this.id = id;
		this.tipologiaBorsaDto = tipologiaBorsaDto;
		this.programma = programma;
		this.enteFinanziario = enteFinanziario;
		this.annoAccademico = annoAccademico;
		this.domandaBorsaDiStudio = domandaBorsaDiStudio;
		this.studente = studente;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipologiaBorsaDto getTipologiaBorsaDto() {
		return tipologiaBorsaDto;
	}

	public void setTipologiaBorsaDto(TipologiaBorsaDto tipologiaBorsaDto) {
		this.tipologiaBorsaDto = tipologiaBorsaDto;
	}

	public String getProgramma() {
		return programma;
	}

	public void setProgramma(String programma) {
		this.programma = programma;
	}

	public String getEnteFinanziario() {
		return enteFinanziario;
	}

	public void setEnteFinanziario(String enteFinanziario) {
		this.enteFinanziario = enteFinanziario;
	}

	public String getAnnoAccademico() {
		return annoAccademico;
	}

	public void setAnnoAccademico(String annoAccademico) {
		this.annoAccademico = annoAccademico;
	}

	public DomandaBorsaDiStudio getDomandaBorsaDiStudio() {
		return domandaBorsaDiStudio;
	}

	public void setDomandaBorsaDiStudio(DomandaBorsaDiStudio domandaBorsaDiStudio) {
		this.domandaBorsaDiStudio = domandaBorsaDiStudio;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	

}
