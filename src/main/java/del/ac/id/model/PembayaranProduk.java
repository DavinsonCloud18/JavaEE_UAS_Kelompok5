package del.ac.id.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pembayaran_produk")
public class PembayaranProduk {
	@Id
	private int pembayaran_id;
	private int produk_id;
	private int user_id;
	private int kuantitas;
	private int status_pembayaran;
	private Date tanggal_transaksi;
	
	public int getPembayaran_id() {
		return pembayaran_id;
	}
	public void setPembayaran_id(int pembayaran_id) {
		this.pembayaran_id = pembayaran_id;
	}
	public int getProduk_id() {
		return produk_id;
	}
	public void setProduk_id(int produk_id) {
		this.produk_id = produk_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getKuantitas() {
		return kuantitas;
	}
	public void setKuantitas(int kuantitas) {
		this.kuantitas = kuantitas;
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
