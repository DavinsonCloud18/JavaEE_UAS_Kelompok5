package del.ac.id.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ruangan")
public class Ruangan {
	@Id
	private int ruangan_id;
	private String nama_ruangan;
	private String lokasi;
	private int status;
	
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
