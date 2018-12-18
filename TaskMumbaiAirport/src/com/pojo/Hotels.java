package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Hotels")
public class Hotels {

	@Id
	@Column(name = "hotelId")
	private int hotelId;
	
	@Column(name = "HotelName")
	private String hotelName;
	
	@Column(name = "Star")
	private int star ;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Distance")
	private String distance;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AirportId", referencedColumnName = "AirportId")
	private Airport airportObject;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Airport getAirportObject() {
		return airportObject;
	}

	public void setAirportObject(Airport airportObject) {
		airportObject = airportObject;
	}
}
