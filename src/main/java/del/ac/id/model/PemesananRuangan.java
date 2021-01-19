package del.ac.id.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pemesanan_ruangan")
public class PemesananRuangan {
	@Id
	private int pemesanan_id;
	private int user_id;
	private int ruangan_id;
	private Date tanggal_pemesanan;
	
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
	public Date getTanggal_pemesanan() {
		return tanggal_pemesanan;
	}
	public void setTanggal_pemesanan(Date tanggal_pemesanan) {
		this.tanggal_pemesanan = tanggal_pemesanan;
	}
}
