package del.ac.id.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.PemesananRuangan;
import del.ac.id.repository.PemesananRuanganRepository;

@Service
@Transactional
public class PemesananRuanganService {
	@Autowired
	private PemesananRuanganRepository pemesananRuanganRepo;
	
	public List<PemesananRuangan> listAllPemesananRuangan(){
	return pemesananRuanganRepo.findAll();
		}
	public void saveRuangan(PemesananRuangan pemesananRuangan) {
		pemesananRuanganRepo.save(pemesananRuangan);
	}
	public PemesananRuangan getPemesananRuangan(Integer id) {
		return pemesananRuanganRepo.findById(id).get();
	}
	public void deletePemesananRuangan(Integer id) {
		pemesananRuanganRepo.deleteById(id);
	}
}

