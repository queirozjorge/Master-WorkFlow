package br.com.masterworkflow.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.masterworkflow.dto.RequisicaoCadastroUnidadesDto;
import br.com.masterworkflow.model.Unidade;
import br.com.masterworkflow.service.UnidadesService;

@RestController
public class CadastroUnidadesController {

	private final UnidadesService cadastroUnidadesService;

	@Autowired
	public CadastroUnidadesController(UnidadesService cadastroUnidadesService) {
		this.cadastroUnidadesService = cadastroUnidadesService;
	}

	@GetMapping
	@RequestMapping("/cadastro")
	public String cadastro(RequisicaoCadastroUnidadesDto requisicao) {
		return "/form-cadastro-unidades";
	}

	@PostMapping("cadastro/cadastrarUnidade")
	public String cadastrar(@Valid @RequestBody RequisicaoCadastroUnidadesDto requisicao, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("erro");
			return "/form-cadastro-unidades";
		}

		Unidade unidade = requisicao.toUnidade();
		cadastroUnidadesService.cadastrar(unidade);
		return "/form-cadastro-unidades";
	}
}
