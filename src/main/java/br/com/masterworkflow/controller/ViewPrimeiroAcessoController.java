package br.com.masterworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.masterworkflow.model.PrimeiroAcessoUnidade;
import br.com.masterworkflow.service.PrimeiroAcessoService;

@RestController
@RequestMapping("/primeiros-cessos")
public class ViewPrimeiroAcessoController {

	private final PrimeiroAcessoService primeiroAcessoService;
	
	@Autowired
	public ViewPrimeiroAcessoController(PrimeiroAcessoService primeiroAcessoService) {
		this.primeiroAcessoService = primeiroAcessoService;
	}
	
	@GetMapping
	public List<PrimeiroAcessoUnidade> getUnidades() {
		return primeiroAcessoService.listar();
	}
}
