package br.com.masterworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.masterworkflow.model.PrimeiroAcessoUnidade;

@Repository
public interface CadastroPrimeiroAcessoUnidadeRepository extends JpaRepository<PrimeiroAcessoUnidade, Long> {

}
