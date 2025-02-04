package com.sesi.projeto.entities;

import java.time.Instant;

import com.sesi.projeto.dto.PagamentoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tb_pagamento")

public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant momento;
	
	@OneToOne
	@MapsId
	private Pedido pedido;

	
	public Pagamento() {
		
	}
	
	public Pagamento(PagamentoDTO l) {
	
		this.momento = l.momento();
		
	
		}
	
	public Pagamento(Long id, Instant momento) {
	this.id = id;
	this.momento = momento;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}
	
	
	
}
