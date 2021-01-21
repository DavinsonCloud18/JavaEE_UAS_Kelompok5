package com.projectjavaee.projectjavaeepulsa.controller;
import com.projectjavaee.projectjavaeepulsa.model.PembayaranPulsa;
import com.projectjavaee.projectjavaeepulsa.service.PembayaranPulsaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/pembayaranpulsa")
public class PembayaranPulsaController {


	@Autowired
	PembayaranPulsaService pembayaranpulsaService;
	
	@GetMapping("")
	public List<PembayaranPulsa> list() {
		return pembayaranpulsaService.listAllPembayaranPulsa();
	}
	
	@GetMapping("/{pembayaran_id}")
	public ResponseEntity<PembayaranPulsa> get(@PathVariable Integer pembayaran_id) {
		try {
			PembayaranPulsa pembayaranpulsa = pembayaranpulsaService.getPembayaranPulsa(pembayaran_id);
			return new ResponseEntity<PembayaranPulsa> (pembayaranpulsa, HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<PembayaranPulsa> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PembayaranPulsa pembayaranpulsa)
	{
		pembayaranpulsaService.savePembayaranPulsa(pembayaranpulsa);
		}
	
	@PutMapping("/{pembayaran_id}")
	public ResponseEntity<?> update(@RequestBody PembayaranPulsa pembayaranpulsa, @PathVariable Integer pembayaran_id) {
		try {
			PembayaranPulsa existPembayaranPulsa = pembayaranpulsaService.getPembayaranPulsa(pembayaran_id);
			pembayaranpulsa.setPembayaran_id(pembayaran_id);
			pembayaranpulsaService.savePembayaranPulsa(pembayaranpulsa);
			return new ResponseEntity<>(HttpStatus.OK);
			}
		catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{pembayaran_id}")
	public void delete(@PathVariable Integer pembayaran_id) {
		pembayaranpulsaService.deletePembayaranPulsa(pembayaran_id);
	}
}
