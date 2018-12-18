package com.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Airport")
public class Airport {

	@Id
	@Column(name = "AirportId")
	private int airportId;
	
	@Column(name = "AirportName")
	private String airportName;
	
	@Column(name = "City")
	private String city;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Terminals.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "AirportId", referencedColumnName="AirportId")
	private Set terminalChild;
	
	@ManyToMany(targetEntity = Flight.class, cascade = CascadeType.ALL)
	@JoinTable(name = "Airport_Flight", joinColumns = @JoinColumn(name = "AirportId", referencedColumnName = "AirportId"),
	inverseJoinColumns = @JoinColumn(name = "FlightId", referencedColumnName = "FlightId"))
	private Set flightSet;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Arrivals.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "OriginId", referencedColumnName="AirportId")
	private Set arrivalsChild;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Departures.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "DestinationId", referencedColumnName="AirportId")
	private Set departurChild;

	public int getAirportId() {
		return airportId;
	}

	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set getTerminalChild() {
		return terminalChild;
	}

	public void setTerminalChild(Set terminalChild) {
		this.terminalChild = terminalChild;
	}

	public Set getFlightSet() {
		return flightSet;
	}

	public void setFlightSet(Set flightSet) {
		this.flightSet = flightSet;
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
