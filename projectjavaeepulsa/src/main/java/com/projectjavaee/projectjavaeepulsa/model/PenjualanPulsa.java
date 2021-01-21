package com.projectjavaee.projectjavaeepulsa.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="penjualan_pulsa")
public class PenjualanPulsa {
	private int penjualan_id;
	private int pulsa_id;
	private Timestamp tanggal_penjualan;
	
	public PenjualanPulsa() {}

	public PenjualanPulsa(int penjualan_id, int pulsa_id, Timestamp tanggal_penjualan) {
		this.penjualan_id = penjualan_id;
		this.pulsa_id = pulsa_id;
		this.tanggal_penjualan = tanggal_penjualan;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPenjualan_id() {
		return penjualan_id;
	}

	public void setPenjualan_id(int penjualan_id) {
		this.penjualan_id = penjualan_id;
	}

	public int getPulsa_id() {
		return pulsa_id;
	}

	public void setPulsa_id(int pulsa_id) {
		this.pulsa_id = pulsa_id;
	}

	public Timestamp getTanggal_penjualan() {
		return tanggal_penjualan;
	}

	public void setTanggal_penjualan(Timestamp tanggal_penjualan) {
		this.tanggal_penjualan = tanggal_penjualan;
	}
	

}
