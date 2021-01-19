package del.ac.id.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pulsa")
public class Pulsa {
	@Id
	private int pulsa_id;
	private int harga_pulsa;
	
	public int getPulsa_id() {
		return pulsa_id;
	}
	public void setPulsa_id(int pulsa_id) {
		this.pulsa_id = pulsa_id;
	}
	public int getHarga_pulsa() {
		return harga_pulsa;
	}
	public void setHarga_pulsa(int harga_pulsa) {
		this.harga_pulsa = harga_pulsa;
	}
}
