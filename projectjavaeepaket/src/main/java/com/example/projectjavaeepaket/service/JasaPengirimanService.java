package com.example.projectjavaeepaket.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectjavaeepaket.model.*;
import com.example.projectjavaeepaket.repository.*;

@Service
@Transactional
public class JasaPengirimanService {

	@Autowired
	private JasaPengirimanRepository jasapengirimanRepository;

	public List<JasaPengiriman> listAllJasaPengiriman(){
		return jasapengirimanRepository.findAll();
	}
	
	public void saveJasaPengiriman(JasaPengiriman jasapengiriman) {
		jasapengirimanRepository.save(jasapengiriman);
		
	}
	
	public JasaPengiriman getJasaPengiriman(Integer paket_id) {
		return jasapengirimanRepository.findById(paket_id).get();
	}
	
	public void deleteJasaPengiriman(Integer paket_id) {
		jasapengirimanRepository.deleteById(paket_id);
	}
}
