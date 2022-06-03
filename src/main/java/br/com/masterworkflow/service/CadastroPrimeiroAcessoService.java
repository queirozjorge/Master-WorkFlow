package br.com.masterworkflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.masterworkflow.model.PrimeiroAcessoUnidade;
import br.com.masterworkflow.repository.PrimeiroAcessoUnidadeRepository;

@Service
public class CadastroPrimeiroAcessoService {

	private PrimeiroAcessoUnidadeRepository cadastroPrimeiroAcessoUnidadeRepository;

	@Autowired
	public CadastroPrimeiroAcessoService(PrimeiroAcessoUnidadeRepository cadastroPrimeiroAcessoUnidadeRepository) {
		this.cadastroPrimeiroAcessoUnidadeRepository = cadastroPrimeiroAcessoUnidadeRepository;
	}
	
	public void cadastrar(PrimeiroAcessoUnidade primeiroAcesso) {
		cadastroPrimeiroAcessoUnidadeRepository.save(primeiroAcesso);
	}
}
