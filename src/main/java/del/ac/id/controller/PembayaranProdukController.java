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
import del.ac.id.model.Produk;
import del.ac.id.service.PembayaranProdukService;

@RestController
@RequestMapping("/pembayaran-produk")
public class PembayaranProdukController {
	@Autowired
	PembayaranProdukService pembayaranService;
	
	@GetMapping("")
	public List<PembayaranProduk> list(){
		return pembayaranService.listAllPembayaranProduk();
	}
	@GetMapping("/{id}")
	public ResponseEntity<PembayaranProduk> get(@PathVariable Integer id){
		try {
			PembayaranProduk pembayaran = pembayaranService.getPembayaran(id);
			return new ResponseEntity<PembayaranProduk>(pembayaran, HttpStatus.OK);
		}	
		catch(NoSuchElementException e){
			return new ResponseEntity<PembayaranProduk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PembayaranProduk pembayaran) {
		pembayaranService.savePembayaranProduk(pembayaran);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PembayaranProduk pembayaran, @PathVariable Integer id){
		try {
			PembayaranProduk isExist = pembayaranService.getPembayaran(id);
			pembayaran.setProduk_id(id);
			pembayaranService.savePembayaranProduk(pembayaran);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<?> cancel(@PathVariable Integer id){
		try {
			PembayaranProduk isExist = pembayaranService.getPembayaran(id);
			isExist.setStatus_pembayaran(0);
			pembayaranService.savePembayaranProduk(isExist);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pembayaranService.deletePembayaranProduk(id);
	}
}
