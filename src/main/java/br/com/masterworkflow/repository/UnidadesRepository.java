package br.com.masterworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.masterworkflow.model.Unidade;

@Repository
public interface UnidadesRepository extends JpaRepository<Unidade,Long> {

}
