package br.com.masterworkflow.dto;

import javax.validation.constraints.NotBlank;

import br.com.masterworkflow.model.PrimeiroAcessoUnidade;

public class RequisicaoCadastroPrimeiroAcessoDto {
	
	@NotBlank(message = "O campo texto descritivo deve estar preenchido!")
	private String textoDescritivo;

	public String getTexto() {
		return textoDescritivo;
	}
	
	public void setTexto(String textoDescritivo) {
		this.textoDescritivo = textoDescritivo;
	}
	
	public PrimeiroAcessoUnidade toPrimeiroAcessoUnidade() {
		PrimeiroAcessoUnidade primeiroAcessoUnidade = new PrimeiroAcessoUnidade();
		primeiroAcessoUnidade.setTextoDescritivo(this.textoDescritivo);
		return primeiroAcessoUnidade;
	}
	
	
}
