package br.com.masterworkflow.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.masterworkflow.model.Unidade;
import br.com.masterworkflow.repository.CadastroUnidadesRepository;

public abstract class CadastroUnidadesService {

	@Autowired
	private static CadastroUnidadesRepository cadastroUnidadesRepository;
	
	public static void cadastrarUnidade (Unidade unidade) {
		cadastroUnidadesRepository.save(unidade);
	}
}
