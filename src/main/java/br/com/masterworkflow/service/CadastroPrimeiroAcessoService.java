package br.com.masterworkflow.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.masterworkflow.model.PrimeiroAcessoUnidade;
import br.com.masterworkflow.repository.CadastroPrimeiroAcessoUnidadeRepository;

public abstract class CadastroPrimeiroAcessoService {
	
	@Autowired
	private static CadastroPrimeiroAcessoUnidadeRepository cadastroPrimeiroAcessoUnidadeRepository;
	
	public static void cadastrar(PrimeiroAcessoUnidade primeiroAcesso) {
		cadastroPrimeiroAcessoUnidadeRepository.save(primeiroAcesso);
	}
}
