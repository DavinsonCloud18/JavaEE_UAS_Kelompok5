package com.projectjavaee.projectjavaeepulsa.controller;
import com.projectjavaee.projectjavaeepulsa.model.PenjualanPulsa;
import com.projectjavaee.projectjavaeepulsa.service.PenjualanPulsaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/penjualanpulsa")
public class PenjualanPulsaController {
	@Autowired
	PenjualanPulsaService penjualanpulsaService;
	
	@GetMapping("")
	public List<PenjualanPulsa> list() {
		return penjualanpulsaService.listAllPenjualanPulsa();
	}
	
	@GetMapping("/{penjualan_id}")
	public ResponseEntity<PenjualanPulsa> get(@PathVariable Integer penjualan_id) {
		try {
			PenjualanPulsa penjualanpulsa = penjualanpulsaService.getPenjualanPulsa(penjualan_id);
			return new ResponseEntity<PenjualanPulsa> (penjualanpulsa, HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
			return new ResponseEntity<PenjualanPulsa> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PenjualanPulsa penjualanpulsa)
	{
		penjualanpulsaService.savePenjualanPulsa(penjualanpulsa);
		}
	
	@PutMapping("/{penjualan_id}")
	public ResponseEntity<?> update(@RequestBody PenjualanPulsa penjualanpulsa, @PathVariable Integer penjualan_id) {
		try {
			PenjualanPulsa existPenjualanPulsa = penjualanpulsaService.getPenjualanPulsa(penjualan_id);
			penjualanpulsa.setPenjualan_id(penjualan_id);
			penjualanpulsaService.savePenjualanPulsa(penjualanpulsa);
			return new ResponseEntity<>(HttpStatus.OK);
			}
		catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{penjualan_id}")
	public void delete(@PathVariable Integer penjualan_id) {
		penjualanpulsaService.deletePenjualanPulsa(penjualan_id);
	}
}
