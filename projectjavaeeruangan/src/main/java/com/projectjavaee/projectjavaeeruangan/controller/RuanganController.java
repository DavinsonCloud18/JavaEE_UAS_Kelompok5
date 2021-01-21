package com.projectjavaee.projectjavaeeruangan.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projectjavaee.projectjavaeeruangan.controller.*;
import com.projectjavaee.projectjavaeeruangan.model.*;
import com.projectjavaee.projectjavaeeruangan.service.*;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ruangan")
public class RuanganController {

	@Autowired
	RuanganService ruanganService;
	
	@GetMapping("")
	public List<Ruangan> list() {
		return ruanganService.listAllRuangan();
	}
	
	@GetMapping("/{ruangan_id}")
	public ResponseEntity<Ruangan> get(@PathVariable Integer ruangan_id) {
		try {
			Ruangan ruangan = ruanganService.getRuangan(ruangan_id);
			return new ResponseEntity<Ruangan> (ruangan, HttpStatus.OK);
			
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<Ruangan> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Ruangan ruangan) {
		ruanganService.saveRuangan(ruangan);
	}
	
	@PutMapping("/{ruangan_id}")
	public ResponseEntity<?> update(@RequestBody Ruangan ruangan, @PathVariable Integer ruangan_id) {
		try {
			Ruangan existRuangan = ruanganService.getRuangan(ruangan_id);
			ruangan.setRuangan_id(ruangan_id);
			ruanganService.saveRuangan(ruangan);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{ruangan_id}")
	public void delete(@PathVariable Integer ruangan_id) {
		ruanganService.deleteRuangan(ruangan_id);
	}
}
