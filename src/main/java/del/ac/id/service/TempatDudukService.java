package del.ac.id.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.TempatDuduk;
import del.ac.id.repository.TempatDudukRepository;

@Service
@Transactional
public class TempatDudukService {
	@Autowired
	private TempatDudukRepository tempatDudukRepo;
	
	public List<TempatDuduk> listAllTempatDuduk(){
		return tempatDudukRepo.findAll();
	}
	public void saveTempatDuduk(TempatDuduk tempatDuduk) {
		tempatDudukRepo.save(tempatDuduk);
	}
	public TempatDuduk getTempatDuduk(Integer id) {
		return tempatDudukRepo.findById(id).get();
	}
	public void deleteTempatDuduk(Integer id) {
		tempatDudukRepo.deleteById(id);
	}
}
