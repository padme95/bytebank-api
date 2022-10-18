package br.com.bytebank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bytebank.entities.TransferenciaEntity;
import br.com.bytebank.services.TransferenciaService;
import lombok.Data;


@Data
@RestController
@RequestMapping("transferencias")
public class TransferenciaController {
	
	@Autowired
	private TransferenciaService transferenciaService;
	
	@GetMapping
	public ResponseEntity<List<TransferenciaEntity>> getAll() {
		return ResponseEntity.ok().body(transferenciaService.getAll());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED) 
	public TransferenciaEntity save(@RequestBody TransferenciaEntity transferencia) {
		return transferenciaService.save(transferencia);
	}
}