package del.ac.id.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.Produk;
import del.ac.id.repository.ProdukRepository;

@Service
@Transactional
public class ProdukService {
	@Autowired
	private ProdukRepository produkRepo;
	
	public List<Produk> listAllProduk(){
		return produkRepo.findAll();
	}
	public void saveProduk(Produk produk) {
		produkRepo.save(produk);
	}
	public Produk getProduk(Integer id) {
		return produkRepo.findById(id).get();
	}
	public void deleteProduk(Integer id) {
		produkRepo.deleteById(id);
	}
}
