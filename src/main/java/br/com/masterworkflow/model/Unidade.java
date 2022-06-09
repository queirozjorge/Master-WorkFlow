package br.com.masterworkflow.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Unidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String descricao;

	@JsonManagedReference
	@OneToOne(mappedBy = "unidade", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private PrimeiroAcessoUnidade primeiroAcesso;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unidade")
	private List<Defeito> defeitos;

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

	@JsonIgnore
	public PrimeiroAcessoUnidade getPrimeiroAcesso() {
		return primeiroAcesso;
	}

	public void setPrimeiroAcesso(PrimeiroAcessoUnidade primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}

}
