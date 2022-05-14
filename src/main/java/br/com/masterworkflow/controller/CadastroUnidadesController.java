package br.com.masterworkflow.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.masterworkflow.dto.RequisicaoCadastroUnidadesDto;
import br.com.masterworkflow.model.Unidade;
import br.com.masterworkflow.service.CadastroUnidadesService;

@Controller
public class CadastroUnidadesController {
	
	@GetMapping
	@RequestMapping("/cadastro")
	public String cadastro(RequisicaoCadastroUnidadesDto requisicao) {
		return "/form-cadastro-unidades";
	}
	
	@PostMapping("cadastro/cadastrarUnidade")
	public String cadastrar(@Valid RequisicaoCadastroUnidadesDto requisicao, BindingResult result) {

		if (result.hasErrors()) {
			return "/form-cadastro-unidades";
		}
		
		Unidade unidade = requisicao.toUnidade();
		CadastroUnidadesService.cadastrar(unidade);
		return "/form-cadastro-unidades";
	}
}
