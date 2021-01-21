package com.projectjavaee.projectjavaeepulsa.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectjavaee.projectjavaeepulsa.model.PembayaranPulsa;
import com.projectjavaee.projectjavaeepulsa.repository.PembayaranPulsaRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PembayaranPulsaService {

	@Autowired
	private PembayaranPulsaRepository pembayaranpulsaRepository;
	
	public List<PembayaranPulsa> listAllPembayaranPulsa(){
		return pembayaranpulsaRepository.findAll();
		
	}
	public void savePembayaranPulsa(PembayaranPulsa pembayaranpulsa) {
		pembayaranpulsaRepository.save(pembayaranpulsa);
	}
	public PembayaranPulsa getPembayaranPulsa(Integer pembayaran_id) {
		return pembayaranpulsaRepository.findById(pembayaran_id).get();
		
	}
	public void deletePembayaranPulsa(Integer pembayaran_id) {
		pembayaranpulsaRepository.deleteById(pembayaran_id);
	}
}
