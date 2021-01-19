package del.ac.id.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produk")
public class Produk {
	@Id
	private int produk_id;
	private String nama_produk;
	private String jenis_produk;
	private String owners;
	private int harga;
	
	public int getProduk_id() {
		return produk_id;
	}
	public void setProduk_id(int produk_id) {
		this.produk_id = produk_id;
	}
	public String getNama_produk() {
		return nama_produk;
	}
	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}
	public String getJenis_produk() {
		return jenis_produk;
	}
	public void setJenis_produk(String jenis_produk) {
		this.jenis_produk = jenis_produk;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
}
