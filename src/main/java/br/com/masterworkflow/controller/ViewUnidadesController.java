package br.com.masterworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.masterworkflow.model.Unidade;
import br.com.masterworkflow.repository.UnidadesRepository;

@RestController
@RequestMapping("/listarUnidades")
public class ViewUnidadesController {

	private final UnidadesRepository unidadesRepository;

	@Autowired
	public ViewUnidadesController(UnidadesRepository unidadesRepository) {
		this.unidadesRepository = unidadesRepository;
	}

	@GetMapping
	public List<Unidade> getUnidades() {
		return unidadesRepository.findAll();
	}
}
