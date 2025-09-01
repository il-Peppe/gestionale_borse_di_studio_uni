package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.dto.BorsaDiStudioDto;

public class StudenteDto implements Serializable {
	
	private int id;
	private BorsaDiStudioDto borsaDiStudioDto;
	private String nome;
	private String cognome;
	private String matricola;
	private Integer mediaVoti;
	private Integer isee;
	private Boolean erasmus;
	private DomandaBorsaDiStudioDto domandaBorsaDiStudioDto;
	
public StudenteDto() {
}

public StudenteDto(int id, String nome, String cognome, String matricola) {
	this.id = id;
	this.nome = nome;
	this.cognome = cognome;
	this.matricola = matricola;
}

public StudenteDto(int id, BorsaDiStudioDto borsaDiStudioDto, String nome, String cognome, String matricola,
		Integer mediaVoti, Integer isee, Boolean erasmus, DomandaBorsaDiStudioDto domandaBorsaDiStudioDto) {
	this.id = id;
	this.borsaDiStudioDto = borsaDiStudioDto;
	this.nome = nome;
	this.cognome = cognome;
	this.matricola = matricola;
	this.mediaVoti = mediaVoti;
	this.isee = isee;
	this.erasmus = erasmus;
	this.domandaBorsaDiStudioDto = domandaBorsaDiStudioDto;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public BorsaDiStudioDto getBorsaDiStudioDto() {
	return borsaDiStudioDto;
}

public void setBorsaDiStudioDto(BorsaDiStudioDto borsaDiStudioDto) {
	this.borsaDiStudioDto = borsaDiStudioDto;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getMatricola() {
	return matricola;
}

public void setMatricola(String matricola) {
	this.matricola = matricola;
}

public Integer getMediaVoti() {
	return mediaVoti;
}

public void setMediaVoti(Integer mediaVoti) {
	this.mediaVoti = mediaVoti;
}

public Integer getIsee() {
	return isee;
}

public void setIsee(Integer isee) {
	this.isee = isee;
}

public Boolean getErasmus() {
	return erasmus;
}

public void setErasmus(Boolean erasmus) {
	this.erasmus = erasmus;
}

public DomandaBorsaDiStudioDto getDomandaBorsaDiStudioDto() {
	return domandaBorsaDiStudioDto;
}

public void setDomandaBorsaDiStudioDto(DomandaBorsaDiStudioDto domandaBorsaDiStudioDto) {
	this.domandaBorsaDiStudioDto = domandaBorsaDiStudioDto;
}



}
