package br.com.masterworkflow.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public List<Unidade> listarPorId(Long id) {
		Optional<Unidade> findById = unidadesRepository.findById(id);
		List<Unidade> lista = new ArrayList<Unidade>();
		findById.ifPresent(lista::add);
		return lista;
	}
}
