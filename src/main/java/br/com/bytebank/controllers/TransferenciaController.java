package br.com.bytebank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bytebank.entities.TransferenciaEntity;
import br.com.bytebank.services.TransferenciaService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@CrossOrigin(origins = "*")
@RequestMapping("transferencias")
@RestController
public class TransferenciaController {
	
	@Autowired
	private TransferenciaService transferenciaService;
	
	@GetMapping
	public List<TransferenciaEntity> getAll(TransferenciaEntity transferencia) {
		return transferenciaService.getAll(transferencia);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable int id) {
		transferenciaService.excluir(id);
	}
	
	@PostMapping
	public TransferenciaEntity inserir(TransferenciaEntity transferencia) {
	 return transferenciaService.inserir(transferencia);
	}
	}
