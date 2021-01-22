package del.ac.id.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.PemesananTempatDuduk;
import del.ac.id.repository.PemesananTempatDudukRepository;

@Service
@Transactional
public class PemesananTempatDudukService {
	@Autowired
	private PemesananTempatDudukRepository pemesananTempatDudukRepo;
	
	public List<PemesananTempatDuduk> listAllPemesananTempatDuduk(){
	return pemesananTempatDudukRepo.findAll();
		}
	public void saveTempatDuduk(PemesananTempatDuduk pemesananTempatDuduk) {
		pemesananTempatDudukRepo.save(pemesananTempatDuduk);
	}
	public PemesananTempatDuduk getPemesananTempatDuduk(Integer id) {
		return pemesananTempatDudukRepo.findById(id).get();
	}
	public void deletePemesananTempatDuduk(Integer id) {
		pemesananTempatDudukRepo.deleteById(id);
	}
}

