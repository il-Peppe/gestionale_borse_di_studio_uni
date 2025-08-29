package com.example.demo.dto;

import java.io.Serializable;
import java.util.Set;

import com.example.demo.entity.BorsaDiStudio;

public class TipologiaBorsaDto implements Serializable {
	
	private int id;
	private String nomeTipologia;
	private Integer sogliaIsee;
	private Integer mediaMinima;
	private String modalitaErogazione;
	private BorsaDiStudio borsaDiStudio;
	
	public TipologiaBorsaDto() {
	}
	
	public TipologiaBorsaDto(int id, String nomeTipologia, String modalitaErogazione) {
		this.id = id;
		this.nomeTipologia = nomeTipologia;
		this.modalitaErogazione = modalitaErogazione;
	}
	
	public TipologiaBorsaDto(int id, String nomeTipologia, Integer sogliaIsee, Integer mediaMinima,
			String modalitaErogazione, BorsaDiStudio borsaDiStudio) {
		this.id = id;
		this.nomeTipologia = nomeTipologia;
		this.sogliaIsee = sogliaIsee;
		this.mediaMinima = mediaMinima;
		this.modalitaErogazione = modalitaErogazione;
		this.borsaDiStudio = borsaDiStudio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeTipologia() {
		return nomeTipologia;
	}

	public void setNomeTipologia(String nomeTipologia) {
		this.nomeTipologia = nomeTipologia;
	}

	public Integer getSogliaIsee() {
		return sogliaIsee;
	}

	public void setSogliaIsee(Integer sogliaIsee) {
		this.sogliaIsee = sogliaIsee;
	}

	public Integer getMediaMinima() {
		return mediaMinima;
	}

	public void setMediaMinima(Integer mediaMinima) {
		this.mediaMinima = mediaMinima;
	}

	public String getModalitaErogazione() {
		return modalitaErogazione;
	}

	public void setModalitaErogazione(String modalitaErogazione) {
		this.modalitaErogazione = modalitaErogazione;
	}

	public BorsaDiStudio getBorsaDiStudio() {
		return borsaDiStudio;
	}

	public void setBorsaDiStudio(BorsaDiStudio borsaDiStudio) {
		this.borsaDiStudio = borsaDiStudio;
	}
	
	

	

}
