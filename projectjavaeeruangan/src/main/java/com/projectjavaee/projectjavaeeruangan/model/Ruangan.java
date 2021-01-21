package com.projectjavaee.projectjavaeeruangan.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ruangan")
public class Ruangan {
	private int ruangan_id;
	private String nama_ruangan;
	private String lokasi;
	private int status;
	
	public Ruangan() {}

	public Ruangan(int ruangan_id, String nama_ruangan, String lokasi, int status) {
		super();
		this.ruangan_id = ruangan_id;
		this.nama_ruangan = nama_ruangan;
		this.lokasi = lokasi;
		this.status = status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getRuangan_id() {
		return ruangan_id;
	}

	public void setRuangan_id(int ruangan_id) {
		this.ruangan_id = ruangan_id;
	}

	public String getNama_ruangan() {
		return nama_ruangan;
	}

	public void setNama_ruangan(String nama_ruangan) {
		this.nama_ruangan = nama_ruangan;
	}

	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
