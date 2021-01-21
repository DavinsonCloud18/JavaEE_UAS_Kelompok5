package com.projectjavaee.projectjavaeepulsa.model;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pulsa")
public class Pulsa {
private int pulsa_id;
private int harga_pulsa;

public Pulsa() {}

public Pulsa(int pulsa_id, int harga_pulsa) {
	super();
	this.pulsa_id = pulsa_id;
	this.harga_pulsa = harga_pulsa;
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
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
