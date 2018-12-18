package com.pojo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Transfers")
public class Transfers {

	@Id
	@Column(name = "TransferId")
	private Integer transferId;
	
	@Column(name = "WehicalType")
	private String wehicalType;
	
	@Column(name = "Rate")
	private Double rate;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AirportId")
	private Airport airportObject;

	public Integer getTransferId() {
		return transferId;
	}

	public void setTransferId(Integer transferId) {
		this.transferId = transferId;
	}

	public String getWehicalType() {
		return wehicalType;
	}

	public void setWehicalType(String wehicalType) {
		this.wehicalType = wehicalType;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Airport getAirportObject() {
		return airportObject;
	}

	public void setAirportObject(Airport airportObject) {
		this.airportObject = airportObject;
	}
	
}
