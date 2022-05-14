package br.com.masterworkflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.masterworkflow.dto.RequisicaoCadastroUnidadesDto;

@Controller
public class CadastroUnidadesController {

	@GetMapping
	@RequestMapping("/cadastro")
	public String cadastro(RequisicaoCadastroUnidadesDto requisicao) {
		return "form-cadastro-unidades";
	}
}
