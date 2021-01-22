package com.projectjavaee.projectjavaeeruangan.service;

import com.projectjavaee.projectjavaeeruangan.model.PemesananRuangan;
import com.projectjavaee.projectjavaeeruangan.repository.PemesananRuanganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PemesananRuanganService {

	@Autowired
	private PemesananRuanganRepository pemesananruanganRepository;
	
	public List<PemesananRuangan> listAllPemesananRuangan() {
	return pemesananruanganRepository.findAll();
	}
	
	public void savePemesananRuangan(PemesananRuangan pemesananruangan) {
		pemesananruanganRepository.save(pemesananruangan);
	}
	
	public PemesananRuangan getPemesananRuangan(Integer pemesanan_id) {
	return pemesananruanganRepository.findById(pemesanan_id).get();
	}
	
	public void deletePemesananRuangan(Integer pemesanan_id) {
	pemesananruanganRepository.deleteById(pemesanan_id);
	}

}
