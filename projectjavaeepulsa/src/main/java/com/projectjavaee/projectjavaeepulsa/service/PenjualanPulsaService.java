package com.projectjavaee.projectjavaeepulsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectjavaee.projectjavaeepulsa.model.PenjualanPulsa;
import com.projectjavaee.projectjavaeepulsa.repository.PenjualanPulsaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PenjualanPulsaService {
	@Autowired
	private PenjualanPulsaRepository penjualanpulsaRepository;
	
	public List<PenjualanPulsa> listAllPenjualanPulsa(){
		return penjualanpulsaRepository.findAll();
		
	}
	public void savePenjualanPulsa(PenjualanPulsa penjualanpulsa) {
		penjualanpulsaRepository.save(penjualanpulsa);
	}
	public PenjualanPulsa getPenjualanPulsa(Integer penjualan_id) {
		return penjualanpulsaRepository.findById(penjualan_id).get();
		
	}
	public void deletePenjualanPulsa(Integer penjualan_id) {
		penjualanpulsaRepository.deleteById(penjualan_id);
	}

}
