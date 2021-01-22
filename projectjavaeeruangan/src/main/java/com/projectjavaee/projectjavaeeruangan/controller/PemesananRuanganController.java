package com.projectjavaee.projectjavaeeruangan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.projectjavaee.projectjavaeeruangan.model.PemesananRuangan;
import com.projectjavaee.projectjavaeeruangan.service.PemesananRuanganService;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/pemesanan_ruangan")
public class PemesananRuanganController {
	@Autowired
	PemesananRuanganService pemesananruanganService;
	
	@GetMapping("")
	public List<PemesananRuangan> list() {
		return pemesananruanganService.listAllPemesananRuangan();
	}
	
	@GetMapping("/{pemesanan_id}")
	public ResponseEntity<PemesananRuangan> get(@PathVariable Integer pemesanan_id) {
		try {
			PemesananRuangan pemesananruangan = pemesananruanganService.getPemesananRuangan(pemesanan_id);
			return new ResponseEntity<PemesananRuangan> (pemesananruangan, HttpStatus.OK);
			
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<PemesananRuangan> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PemesananRuangan pemesananruangan) {
		pemesananruanganService.savePemesananRuangan(pemesananruangan);
	}
	
	@PutMapping("/{pemesanan_id}")
	public ResponseEntity<?> update(@RequestBody PemesananRuangan pemesananruangan, @PathVariable Integer pemesanan_id) {
		try {
			PemesananRuangan existPemesananRuangan = pemesananruanganService.getPemesananRuangan(pemesanan_id);
			pemesananruangan.setPemesanan_id(pemesanan_id);
			pemesananruanganService.savePemesananRuangan(pemesananruangan);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{pemesanan_id}")
	public void delete(@PathVariable Integer pemesanan_id) {
		pemesananruanganService.deletePemesananRuangan(pemesanan_id);
	}
	
}
