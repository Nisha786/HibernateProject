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
	private Integer hotelId;
	
	@Column(name = "HotelName")
	private String hotelName;
	
	@Column(name = "Star")
	private Integer star ;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Distance")
	private String distance;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AirportId", referencedColumnName = "AirportId")
	private Airport airportObject2;

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
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

	public Airport getAirportObject2() {
		return airportObject2;
	}

	public void setAirportObject2(Airport airportObject2) {
		this.airportObject2 = airportObject2;
	}
}
