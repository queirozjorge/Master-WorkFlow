package br.com.masterworkflow.dto;

import javax.validation.constraints.NotBlank;

import br.com.masterworkflow.model.Defeito;

public class RequisicaoDefeitoDto {

	@NotBlank(message = "O campo título deve estar preenchido!")
	private String titulo;

	@NotBlank(message = "O campo texto deve estar preenchido!")
	private String texto;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Defeito toDefeito() {
		Defeito defeito = new Defeito();
		defeito.setTexto(this.texto);
		defeito.setTitulo(this.titulo);
		return defeito;
	}

}
