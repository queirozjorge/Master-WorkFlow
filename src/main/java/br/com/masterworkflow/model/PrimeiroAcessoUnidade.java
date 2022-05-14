package br.com.masterworkflow.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PrimeiroAcessoUnidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "primeiroAcesso", fetch = FetchType.LAZY)
	private Unidade unidade;

	private String textoDescritivo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public String getTextoDescritivo() {
		return textoDescritivo;
	}

	public void setTextoDescritivo(String textoDescritivo) {
		this.textoDescritivo = textoDescritivo;
	}

}
