package br.com.masterworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.masterworkflow.model.PrimeiroAcessoUnidade;

@Repository
public interface PrimeiroAcessoUnidadeRepository extends JpaRepository<PrimeiroAcessoUnidade, Long> {

}
