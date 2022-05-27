package br.com.masterworkflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.masterworkflow.model.Unidade;
import br.com.masterworkflow.repository.UnidadesRepository;

@Service
public class UnidadesService {

	private final UnidadesRepository unidadesRepository;

	@Autowired
	public UnidadesService(UnidadesRepository unidadesRepository) {
		this.unidadesRepository = unidadesRepository;
	}

	public void cadastrar(Unidade unidade) {
		unidadesRepository.save(unidade);
	}

	public List<Unidade> listar() {
		return unidadesRepository.findAll();
	}
}
