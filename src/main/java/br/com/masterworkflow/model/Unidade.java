package br.com.masterworkflow.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Unidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private PrimeiroAcessoUnidade primeiroAcesso;

	private String nome;
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PrimeiroAcessoUnidade getPrimeiroAcesso() {
		return primeiroAcesso;
	}

	public void setPrimeiroAcesso(PrimeiroAcessoUnidade primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}

}