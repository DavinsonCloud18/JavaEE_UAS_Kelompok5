package com.projectjavaee.projectjavaeeruangan.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "pemesanan_ruangan")
public class PemesananRuangan {

	private int pemesanan_id;
	private int user_id;
	private int ruangan_id;
	private Timestamp tanggal_pemesanan;
	
	public PemesananRuangan() {}

	public PemesananRuangan(int pemesanan_id, int user_id, int ruangan_id, Timestamp tanggal_pemesanan) {
		this.pemesanan_id = pemesanan_id;
		this.user_id = user_id;
		this.ruangan_id = ruangan_id;
		this.tanggal_pemesanan = tanggal_pemesanan;
	}

	public int getPemesanan_id() {
		return pemesanan_id;
	}

	public void setPemesanan_id(int pemesanan_id) {
		this.pemesanan_id = pemesanan_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getRuangan_id() {
		return ruangan_id;
	}

	public void setRuangan_id(int ruangan_id) {
		this.ruangan_id = ruangan_id;
	}

	public Timestamp getTanggal_pemesanan() {
		return tanggal_pemesanan;
	}

	public void setTanggal_pemesanan(Timestamp tanggal_pemesanan) {
		this.tanggal_pemesanan = tanggal_pemesanan;
	}
	
	
	
}
