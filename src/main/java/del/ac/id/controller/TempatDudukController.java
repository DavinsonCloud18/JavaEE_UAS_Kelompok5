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

import del.ac.id.model.TempatDuduk;
import del.ac.id.service.TempatDudukService;

@RestController
@RequestMapping("/tempat-duduk")
public class TempatDudukController {
	@Autowired
	TempatDudukService tempatDudukService;
	
	@GetMapping("")
	public List<TempatDuduk> list(){
		return tempatDudukService.listAllTempatDuduk();
	}
	@GetMapping("/{id}")
	public ResponseEntity<TempatDuduk> get(@PathVariable Integer id){
		try {
			TempatDuduk tempatDuduk = tempatDudukService.getTempatDuduk(id);
			return new ResponseEntity<TempatDuduk>(tempatDuduk, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<TempatDuduk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody TempatDuduk tempatDuduk) {
		tempatDudukService.saveTempatDuduk(tempatDuduk);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody TempatDuduk tempatDuduk, @PathVariable Integer id){
		try {
			TempatDuduk isExist = tempatDudukService.getTempatDuduk(id);
			tempatDuduk.setTempat_duduk_id(id);
			tempatDudukService.saveTempatDuduk(tempatDuduk);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		tempatDudukService.deleteTempatDuduk(id);
	}
}
