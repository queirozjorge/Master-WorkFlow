package br.com.masterworkflow.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.masterworkflow.dto.RequisicaoCadastroPrimeiroAcessoDto;
import br.com.masterworkflow.model.PrimeiroAcessoUnidade;
import br.com.masterworkflow.service.CadastroPrimeiroAcessoService;

@Controller
public class CadastroPrimeiroAcessoUnidadeController {

	private final CadastroPrimeiroAcessoService cadastroPrimeiroAcessoService;

	@Autowired
	public CadastroPrimeiroAcessoUnidadeController(CadastroPrimeiroAcessoService cadastroPrimeiroAcessoService) {
		this.cadastroPrimeiroAcessoService = cadastroPrimeiroAcessoService;
	}

	@GetMapping
	@RequestMapping("/cadastroPrimeiroAcesso")
	public String cadastro(RequisicaoCadastroPrimeiroAcessoDto requisicao) {
		return "/form-cadastro-primeiro-acesso";
	}

	@PostMapping("cadastroPrimeiroAcesso/cadastrarPrimeiroAcesso")
	public String cadastrar(@Valid RequisicaoCadastroPrimeiroAcessoDto requisicao, BindingResult result) {

		if (result.hasErrors()) {
			return "/form-cadastro-primeiro-acesso";
		}

		PrimeiroAcessoUnidade primeiroAcessoUnidade = requisicao.toPrimeiroAcessoUnidade();
		cadastroPrimeiroAcessoService.cadastrar(primeiroAcessoUnidade);
		return "/form-cadastro-primeiro-acesso";
	}
}
