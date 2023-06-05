package br.com.nttdata.generali.tiaasyncmiddleware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nttdata.generali.tiaasyncmiddleware.model.Pagamentos;

public interface PagamentosRepository extends JpaRepository<Pagamentos, Long>{

	
}
