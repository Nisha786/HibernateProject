package com.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Transfers")
public class Transfers {

	@Id
	@Column(name = "TransferId")
	private int transferId;
	
	@Column(name = "WehicalType")
	private String wehicalType;
	
	@Column(name = "Rate")
	private double rate;

	public int getTransferId() {
		return transferId;
	}

	public void setTransferId(int transferId) {
		this.transferId = transferId;
	}

	public String getWehicalType() {
		return wehicalType;
	}

	public void setWehicalType(String wehicalType) {
		this.wehicalType = wehicalType;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
