package com.example.projectjavaeepaket.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projectjavaeepaket.model.*;
import com.example.projectjavaeepaket.service.*;


@RestController
@RequestMapping("/jasapengiriman")
public class JasaPengirimanController {

	@Autowired
	JasaPengirimanService jasapengirimanService;
	
	@GetMapping("")
	public List<JasaPengiriman> list(){
		return jasapengirimanService.listAllJasaPengiriman();
	}
	
	@GetMapping("/{paket_id}")
	public ResponseEntity<JasaPengiriman> get(@PathVariable Integer paket_id) {
		try {
			JasaPengiriman jasapengiriman = jasapengirimanService.getJasaPengiriman(paket_id);
			return new ResponseEntity<JasaPengiriman> (jasapengiriman, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<JasaPengiriman> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody JasaPengiriman jasapengiriman) {
		jasapengirimanService.saveJasaPengiriman(jasapengiriman);
	}
	
	@PutMapping("/{paket_id}")
	public ResponseEntity <JasaPengiriman> update (@RequestBody JasaPengiriman jasapengiriman, @PathVariable Integer paket_id) {
	
		try {
			JasaPengiriman existJasaPengiriman = jasapengirimanService.getJasaPengiriman(paket_id);
			jasapengiriman.setPaket_id(paket_id);
			jasapengirimanService.saveJasaPengiriman(jasapengiriman);
		
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{paket_id}")
	public void delete(@PathVariable Integer paket_id) {
		jasapengirimanService.deleteJasaPengiriman(paket_id);
	}

	
}
