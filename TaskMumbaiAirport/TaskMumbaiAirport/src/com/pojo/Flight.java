package com.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Flight")
public class Flight {

	@Id
	@Column(name = "FlightId")
	private Integer flightId;
	
	@Column(name = "Carrier")
	private String carrier;
	
	@Column(name = "FlightName")
	private String flightName;
	
	@Column(name = "FlightType")
	private String flightType;
	
	@ManyToMany(targetEntity = Airport.class, mappedBy = "flightSet")
	private Set airportSet;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Arrivals.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "FlightId", referencedColumnName="FlightId")
	private Set arrivalsChild;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Departures.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "FlightId", referencedColumnName="FlightId")
	private Set departurChild;


	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public Set getAirportSet() {
		return airportSet;
	}

	public void setAirportSet(Set airportSet) {
		this.airportSet = airportSet;
	}

	public Set getArrivalsChild() {
		return arrivalsChild;
	}

	public void setArrivalsChild(Set arrivalsChild) {
		this.arrivalsChild = arrivalsChild;
	}

	public Set getDeparturChild() {
		return departurChild;
	}

	public void setDeparturChild(Set departurChild) {
		this.departurChild = departurChild;
	}

	
}
