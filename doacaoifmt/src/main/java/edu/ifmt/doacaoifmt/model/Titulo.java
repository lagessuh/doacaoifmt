package edu.ifmt.doacaoifmt.model;

import java.time.LocalDate;


import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String nomeDoDoador;
    private String descricao;
    private int quantidade;
    private LocalDate dataDeDoacao;
    
	public String getNomeDoDoador() {
		return nomeDoDoador;
	}
	public void setNomeDoDoador(String nomeDoDoador) {
		this.nomeDoDoador = nomeDoDoador;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getDataDeDoacao() {
		return dataDeDoacao;
	}
	public void setDataDeDoacao(LocalDate dataDeDoacao) {
		this.dataDeDoacao = dataDeDoacao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		return Objects.equals(id, other.id);
	}
	

	
	
	
	

}
