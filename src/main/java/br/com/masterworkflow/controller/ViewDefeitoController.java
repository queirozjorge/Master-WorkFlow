package br.com.masterworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.masterworkflow.model.Defeito;
import br.com.masterworkflow.service.DefeitoService;

@RestController
@RequestMapping("/listar-defeitos")
public class ViewDefeitoController {

	private final DefeitoService defeitoService;

	@Autowired
	public ViewDefeitoController(DefeitoService defeitoService) {
		this.defeitoService = defeitoService;
	}

	@GetMapping
	public List<Defeito> getDefeitos() {
		return defeitoService.listar();
	}
}
