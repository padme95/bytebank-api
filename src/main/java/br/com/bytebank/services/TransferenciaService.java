package br.com.bytebank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bytebank.entities.TransferenciaEntity;
import br.com.bytebank.repositories.TransferenciaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class TransferenciaService {

	@Autowired
	TransferenciaRepository transferenciaRepository;
	
	public List<TransferenciaEntity> getAll(TransferenciaEntity transferencia) {
		return transferenciaRepository.findAll();
	}
	
	public void excluir(int id) {
		transferenciaRepository.deleteById(id); 
	}
	
	public TransferenciaEntity inserir(TransferenciaEntity transferencia) {
		return transferenciaRepository.save(transferencia);
	}
}
