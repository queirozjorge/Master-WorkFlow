package br.com.masterworkflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.masterworkflow.model.PrimeiroAcessoUnidade;
import br.com.masterworkflow.repository.PrimeiroAcessoUnidadeRepository;

@Service
public class PrimeiroAcessoService {

	private PrimeiroAcessoUnidadeRepository primeiroAcessoUnidadeRepository;

	@Autowired
	public PrimeiroAcessoService(PrimeiroAcessoUnidadeRepository primeiroAcessoUnidadeRepository) {
		this.primeiroAcessoUnidadeRepository = primeiroAcessoUnidadeRepository;
	}
	
	public void cadastrar(PrimeiroAcessoUnidade primeiroAcesso) {
		primeiroAcessoUnidadeRepository.save(primeiroAcesso);
	}
	
	public List<PrimeiroAcessoUnidade> listar() {
		return primeiroAcessoUnidadeRepository.findAll();
	}
}
