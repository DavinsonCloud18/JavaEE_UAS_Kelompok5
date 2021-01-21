package com.projectjavaee.projectjavaeepulsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectjavaee.projectjavaeepulsa.model.Pulsa;
import com.projectjavaee.projectjavaeepulsa.repository.PulsaRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PulsaService {

	@Autowired
	private PulsaRepository pulsaRepository;
	
	public List<Pulsa> listAllPulsa(){
		return pulsaRepository.findAll();
		
	}
	public void savePulsa(Pulsa pulsa) {
		pulsaRepository.save(pulsa);
	}
	public Pulsa getPulsa(Integer pulsa_id) {
		return pulsaRepository.findById(pulsa_id).get();
		
	}
	public void deletePulsa(Integer pulsa_id) {
		pulsaRepository.deleteById(pulsa_id);
	}
}
