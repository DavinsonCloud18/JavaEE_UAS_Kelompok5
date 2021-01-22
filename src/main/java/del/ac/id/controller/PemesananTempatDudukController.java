package del.ac.id.controller;

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

import del.ac.id.model.PembayaranProduk;
import del.ac.id.model.PemesananTempatDuduk;
import del.ac.id.service.PembayaranProdukService;
import del.ac.id.service.PemesananTempatDudukService;

@RestController
@RequestMapping("/pemesanan-tempat-duduk")
public class PemesananTempatDudukController {
	@Autowired
	PemesananTempatDudukService pemesananService;
	
	@GetMapping("")
	public List<PemesananTempatDuduk> list(){
		return pemesananService.listAllPemesananTempatDuduk();
	}
	@GetMapping("/{id}")
	public ResponseEntity<PemesananTempatDuduk> get(@PathVariable Integer id){
		try {
			PemesananTempatDuduk pemesanan = pemesananService.getPemesananTempatDuduk(id);
			return new ResponseEntity<PemesananTempatDuduk>(pemesanan, HttpStatus.OK);
		}	
		catch(NoSuchElementException e){
			return new ResponseEntity<PemesananTempatDuduk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PemesananTempatDuduk pemesanan) {
		pemesananService.saveTempatDuduk(pemesanan);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PemesananTempatDuduk pemesanan, @PathVariable Integer id){
		try {
			PemesananTempatDuduk isExist = pemesananService.getPemesananTempatDuduk(id);
			pemesanan.setTempat_duduk_id(id);
			pemesananService.saveTempatDuduk(pemesanan);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesananService.deletePemesananTempatDuduk(id);
	}
}
