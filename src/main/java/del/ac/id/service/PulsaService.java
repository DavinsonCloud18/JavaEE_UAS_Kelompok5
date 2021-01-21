package del.ac.id.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.Pulsa;
import del.ac.id.repository.PulsaRepository;

@Service
@Transactional
public class PulsaService {
	@Autowired
	private PulsaRepository pulsaRepo;
	
	public List<Pulsa> listAllPulsa(){
		return pulsaRepo.findAll();
	}
	public void savePulsa(Pulsa pulsa) {
		pulsaRepo.save(pulsa);
	}
	public Pulsa getPulsa(Integer id) {
		return pulsaRepo.findById(id).get();
	}
	public void deletePulsa(Integer id) {
		pulsaRepo.deleteById(id);
	}
}
