package del.ac.id.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pembayaran_pulsa")
public class PembayaranPulsa {
	@Id
	private int pembayaran_id;
	private int pulsa_id;
	private int user_id;
	private int status_pembayaran;
	private Date tanggal_transaksi;
	
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
	public Date getTanggal_transaksi() {
		return tanggal_transaksi;
	}
	public void setTanggal_transaksi(Date tanggal_transaksi) {
		this.tanggal_transaksi = tanggal_transaksi;
	}
}
