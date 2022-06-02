package br.com.masterworkflow.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.masterworkflow.dto.RequisicaoDefeitoDto;
import br.com.masterworkflow.model.Defeito;
import br.com.masterworkflow.service.DefeitoService;

@RestController
public class DefeitoController {

	private final DefeitoService defeitoService;

	@Autowired
	public DefeitoController(DefeitoService defeitoService) {
		this.defeitoService = defeitoService;
	}
	
	@GetMapping
	@RequestMapping("/defeitos")
	public String defeito(RequisicaoDefeitoDto requisicao) {
		return "/form-defeito";
	}
	
	@PostMapping("defeitos/cadastrar")
	public String cadastrar(@Valid RequisicaoDefeitoDto requisicao, BindingResult result) {

		if (result.hasErrors()) {
			return "/form-defeito";
		}

		Defeito defeito = requisicao.toDefeito();
		defeitoService.cadastrar(defeito);
		return "/form-defeito";
	}
}
