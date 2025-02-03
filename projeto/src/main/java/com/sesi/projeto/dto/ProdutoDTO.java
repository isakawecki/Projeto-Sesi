package com.sesi.projeto.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record ProdutoDTO(String nome, double preco, String descricao) {

}
