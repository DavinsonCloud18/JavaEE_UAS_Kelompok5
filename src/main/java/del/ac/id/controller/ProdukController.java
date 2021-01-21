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

import del.ac.id.model.Produk;
import del.ac.id.service.ProdukService;

@RestController
@RequestMapping("/produk")
public class ProdukController {
	@Autowired
	ProdukService produkService;
	
	@GetMapping("")
	public List<Produk> list(){
		return produkService.listAllProduk();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produk> get(@PathVariable Integer id){
		try {
			Produk produk = produkService.getProduk(id);
			return new ResponseEntity<Produk>(produk, HttpStatus.OK);
		}	
		catch(NoSuchElementException e){
			return new ResponseEntity<Produk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Produk produk) {
		produkService.saveProduk(produk);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Produk produk, @PathVariable Integer id){
		try {
			Produk isExist = produkService.getProduk(id);
			produk.setProduk_id(id);
			produkService.saveProduk(produk);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<?> cancel(@RequestBody Produk produk, @PathVariable Integer id){
		try {
			Produk isExist = produkService.getProduk(id);
			produk.setProduk_id(id);
			produkService.saveProduk(produk);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		produkService.deleteProduk(id);
	}
}
