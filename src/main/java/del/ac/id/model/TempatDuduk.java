package del.ac.id.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tempat_duduk")
public class TempatDuduk {
	@Id
	private int tempat_duduk_id;
	private String lokasi;
	private int status;
	
	
	public int getTempat_duduk_id() {
		return tempat_duduk_id;
	}
	public void setTempat_duduk_id(int tempat_duduk_id) {
		this.tempat_duduk_id = tempat_duduk_id;
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
