package br.com.masterworkflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.masterworkflow.model.Defeito;
import br.com.masterworkflow.repository.DefeitoRepository;

@Service
public class DefeitoService {

	private final DefeitoRepository defeitoRepository;

	@Autowired
	public DefeitoService(DefeitoRepository defeitoRepository) {
		this.defeitoRepository = defeitoRepository;
	}

	public void cadastrar(Defeito defeito) {
		defeitoRepository.save(defeito);
	}

	public List<Defeito> listar() {
		return defeitoRepository.findAll();
	}

}
