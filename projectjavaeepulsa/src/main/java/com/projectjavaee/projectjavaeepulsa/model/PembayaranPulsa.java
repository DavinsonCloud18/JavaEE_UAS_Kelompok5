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
@Table(name="pembayaran_pulsa")
public class PembayaranPulsa {
	
	private int pembayaran_id;
	private int pulsa_id;
	private int user_id;
	private int status_pembayaran;
	private Timestamp tanggal_transaksi;
	
	public PembayaranPulsa() {}

	public PembayaranPulsa(int pembayaran_id, int pulsa_id, int user_id, int status_pembayaran,
			Timestamp tanggal_transaksi) {
		this.pembayaran_id = pembayaran_id;
		this.pulsa_id = pulsa_id;
		this.user_id = user_id;
		this.status_pembayaran = status_pembayaran;
		this.tanggal_transaksi = tanggal_transaksi;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPembayaran_id() {
		return pembayaran_id;
	}

	public void setPembayaran_id(int pembayaran_id) {
		this.pembayaran_id = pembayaran_id;
	}

	public int getPulsa_id() {
		return pulsa_id;
	}

	public void setPulsa_id(int pulsa_id) {
		this.pulsa_id = pulsa_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getStatus_pembayaran() {
		return status_pembayaran;
	}

	public void setStatus_pembayaran(int status_pembayaran) {
		this.status_pembayaran = status_pembayaran;
	}

	public Timestamp getTanggal_transaksi() {
		return tanggal_transaksi;
	}

	public void setTanggal_transaksi(Timestamp tanggal_transaksi) {
		this.tanggal_transaksi = tanggal_transaksi;
	}
	
	
	
}
