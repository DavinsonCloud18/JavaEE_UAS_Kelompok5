package del.ac.id.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jasa_pengiriman")
public class JasaPengiriman {
	@Id
	private int paket_id;
	private int user_id;
	private String nama_paket;
	private String alamat_tujuan;
	private String alamat_pengirim;
	private String nomor_hp_penerima;
	private String deskripsi_paket;
	private int harga_pengiriman;
	private int status_pembayaran;
	private Date tanggal_transaksi;
		
	public int getPaket_id() {
		return paket_id;
	}
	public void setPaket_id(int paket_id) {
		this.paket_id = paket_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getNama_paket() {
		return nama_paket;
	}
	public void setNama_paket(String nama_paket) {
		this.nama_paket = nama_paket;
	}
	public String getAlamat_tujuan() {
		return alamat_tujuan;
	}
	public void setAlamat_tujuan(String alamat_tujuan) {
		this.alamat_tujuan = alamat_tujuan;
	}
	public String getAlamat_pengirim() {
		return alamat_pengirim;
	}
	public void setAlamat_pengirim(String alamat_pengirim) {
		this.alamat_pengirim = alamat_pengirim;
	}
	public String getNomor_hp_penerima() {
		return nomor_hp_penerima;
	}
	public void setNomor_hp_penerima(String nomor_hp_penerima) {
		this.nomor_hp_penerima = nomor_hp_penerima;
	}
	public String getDeskripsi_paket() {
		return deskripsi_paket;
	}
	public void setDeskripsi_paket(String deskripsi_paket) {
		this.deskripsi_paket = deskripsi_paket;
	}
	public int getHarga_pengiriman() {
		return harga_pengiriman;
	}
	public void setHarga_pengiriman(int harga_pengiriman) {
		this.harga_pengiriman = harga_pengiriman;
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
