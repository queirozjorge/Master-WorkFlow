package br.com.masterworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.masterworkflow.model.Unidade;

import br.com.masterworkflow.service.UnidadesService;

@RestController
@RequestMapping("/listar-unidades")
public class ViewUnidadesController {

	private final UnidadesService unidadesService;

	@Autowired
	public ViewUnidadesController(UnidadesService unidadesService) {
		this.unidadesService = unidadesService;

	}

	@GetMapping
	public List<Unidade> getUnidades() {
		return unidadesService.listar();
	}
}
