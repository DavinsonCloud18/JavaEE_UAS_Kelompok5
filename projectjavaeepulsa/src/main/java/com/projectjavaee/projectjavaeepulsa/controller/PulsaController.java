package com.projectjavaee.projectjavaeepulsa.controller;

import com.projectjavaee.projectjavaeepulsa.model.Pulsa;

import com.projectjavaee.projectjavaeepulsa.service.PulsaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/pulsa")
public class PulsaController {

	@Autowired
	PulsaService pulsaService;
	
	@GetMapping("")
	public List<Pulsa> list() {
		return pulsaService.listAllPulsa();
	}
	
	@GetMapping("/{pulsa_id}")
	public ResponseEntity<Pulsa> get(@PathVariable Integer pulsa_id) {
		try {
			Pulsa pulsa = pulsaService.getPulsa(pulsa_id);
			return new ResponseEntity<Pulsa> (pulsa, HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<Pulsa> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Pulsa pulsa)
	{
		pulsaService.savePulsa(pulsa);
		}
	
	@PutMapping("/{pulsa_id}")
	public ResponseEntity<?> update(@RequestBody Pulsa pulsa, @PathVariable Integer pulsa_id) {
		try {
			Pulsa existPulsa = pulsaService.getPulsa(pulsa_id);
			pulsa.setPulsa_id(pulsa_id);
			pulsaService.savePulsa(pulsa);
			return new ResponseEntity<>(HttpStatus.OK);
			}
		catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{pulsa_id}")
	public void delete(@PathVariable Integer pulsa_id) {
		pulsaService.deletePulsa(pulsa_id);
	}
}
