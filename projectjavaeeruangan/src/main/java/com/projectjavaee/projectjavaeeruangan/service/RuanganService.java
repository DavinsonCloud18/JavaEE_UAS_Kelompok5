package com.projectjavaee.projectjavaeeruangan.service;

import com.projectjavaee.projectjavaeeruangan.model.Ruangan;
import com.projectjavaee.projectjavaeeruangan.repository.RuanganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RuanganService {

	@Autowired
	private RuanganRepository ruanganRepository;
	
	public List<Ruangan> listAllRuangan() {
	return ruanganRepository.findAll();
	}
	
	public void saveRuangan(Ruangan ruangan) {
		ruanganRepository.save(ruangan);
	}
	
	public Ruangan getRuangan(Integer ruangan_id) {
	return ruanganRepository.findById(ruangan_id).get();
	}
	
	public void deleteRuangan(Integer ruangan_id) {
	ruanganRepository.deleteById(ruangan_id);
	}
	
}

