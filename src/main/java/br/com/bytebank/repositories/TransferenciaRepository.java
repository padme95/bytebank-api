package br.com.bytebank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bytebank.entities.TransferenciaEntity;
@Repository
public interface TransferenciaRepository extends JpaRepository<TransferenciaEntity, Integer>{
		
}
