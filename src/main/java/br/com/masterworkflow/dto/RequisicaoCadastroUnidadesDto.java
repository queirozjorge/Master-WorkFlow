package br.com.masterworkflow.dto;

import javax.validation.constraints.NotBlank;

import br.com.masterworkflow.model.Unidade;

public class RequisicaoCadastroUnidadesDto {
	
	@NotBlank(message = "O campo nome deve estar preenchido!")
	private String nome;
	
	@NotBlank(message = "O campo descrição deve estar preenchido!")
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

	public Unidade toUnidade() {
		Unidade unidade = new Unidade();
		unidade.setNome(this.nome);
		unidade.setDescricao(this.descricao);
		return unidade;
	}

}
