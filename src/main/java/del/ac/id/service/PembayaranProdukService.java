package del.ac.id.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.PembayaranProduk;
import del.ac.id.repository.PembayaranProdukRepository;

@Service
@Transactional
public class PembayaranProdukService {
	@Autowired
	public PembayaranProdukRepository pembayaranRepo;
	
	public List<PembayaranProduk> listAllPembayaranProduk(){
		return pembayaranRepo.findAll();
	}
	public void savePembayaranProduk(PembayaranProduk pembayaran) {
		pembayaranRepo.save(pembayaran);
	}
	public PembayaranProduk getPembayaran(Integer id) {
		return pembayaranRepo.findById(id).get();
	}
	public void deletePembayaranProduk(Integer id) {
		pembayaranRepo.deleteById(id);
	}
}
