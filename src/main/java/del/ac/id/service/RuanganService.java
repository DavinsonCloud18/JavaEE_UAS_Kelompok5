package del.ac.id.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.Ruangan;
import del.ac.id.repository.RuanganRepository;

@Service
@Transactional
public class RuanganService {
	@Autowired
	private RuanganRepository ruanganRepo;
	
	public List<Ruangan> listAllRuangan(){
		return ruanganRepo.findAll();
	}
	
	public void saveRuangan(Ruangan ruangan) {
		ruanganRepo.save(ruangan);
	}
	public Ruangan getRuangan(Integer id) {
		return ruanganRepo.findById(id).get();
	}
	public void deleteRuangan(Integer id) {
		ruanganRepo.deleteById(id);
	}
}
