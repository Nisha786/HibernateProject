package com.pojo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CarRental")
public class CarRental {

	@Id
	@Column(name = "CarRentalId")
	private int carRentalId;
	
	@Column(name = "Drop_Off")
	private String drop_Off;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "PickUp_Date")
	private Date pickUp_Date;
	
	@Temporal(TemporalType.TIME)
    @Column(name = "PickUp_Time")
	private Date pickUp_Time;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Return_Date")
	private Date return_Date;
	
	@Temporal(TemporalType.TIME)
    @Column(name = "Return_Time")
	private Date return_Time;
	
	@Column(name = "Passengers")
	private int passengers;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AirportId", referencedColumnName = "AirportId")
	private Airport airportObject;

	public int getCarRentalId() {
		return carRentalId;
	}

	public void setCarRentalId(int carRentalId) {
		this.carRentalId = carRentalId;
	}

	public String getDrop_Off() {
		return drop_Off;
	}

	public void setDrop_Off(String drop_Off) {
		this.drop_Off = drop_Off;
	}

	public Date getPickUp_Date() {
		return pickUp_Date;
	}

	public void setPickUp_Date(Date pickUp_Date) {
		this.pickUp_Date = pickUp_Date;
	}

	public Date getPickUp_Time() {
		return pickUp_Time;
	}

	public void setPickUp_Time(Date pickUp_Time) {
		this.pickUp_Time = pickUp_Time;
	}

	public Date getReturn_Date() {
		return return_Date;
	}

	public void setReturn_Date(Date return_Date) {
		this.return_Date = return_Date;
	}

	public Date getReturn_Time() {
		return return_Time;
	}

	public void setReturn_Time(Date return_Time) {
		this.return_Time = return_Time;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public Airport getAirportObject() {
		return airportObject;
	}

	public void setAirportObject(Airport airportObject) {
		this.airportObject = airportObject;
	}
	
}
