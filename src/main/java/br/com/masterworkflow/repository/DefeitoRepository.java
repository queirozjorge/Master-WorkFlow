package br.com.masterworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.masterworkflow.model.Defeito;

public interface DefeitoRepository extends JpaRepository<Defeito, Long> {

}
