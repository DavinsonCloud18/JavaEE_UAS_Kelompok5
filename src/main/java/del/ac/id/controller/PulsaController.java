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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import del.ac.id.model.Pulsa;
import del.ac.id.service.PulsaService;

@RestController
@RequestMapping("/pulsa")
public class PulsaController {
	@Autowired
	PulsaService pulsaService;
	
	@GetMapping("")
	public List<Pulsa> list(){
		return pulsaService.listAllPulsa();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Pulsa> get(@PathVariable Integer id){
		try {
			Pulsa pulsa = pulsaService.getPulsa(id);
			return new ResponseEntity<Pulsa>(pulsa, HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<Pulsa>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity add(@RequestBody Pulsa pulsa,@PathVariable Integer id) {
		try {
			Pulsa isExist = pulsaService.getPulsa(id);
			pulsa.setPulsa_id(id);
			pulsaService.savePulsa(pulsa);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pulsaService.deletePulsa(id);
	}
}
