package br.com.masterworkflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.masterworkflow.model.Unidade;
import br.com.masterworkflow.repository.UnidadesRepository;

@Service
public class CadastroUnidadesService {

	private final UnidadesRepository cadastroUnidadesRepository;

	@Autowired
	public CadastroUnidadesService(UnidadesRepository cadastroUnidadesRepository) {
		this.cadastroUnidadesRepository = cadastroUnidadesRepository;
	}

	public void cadastrar(Unidade unidade) {
		cadastroUnidadesRepository.save(unidade);
	}
}
