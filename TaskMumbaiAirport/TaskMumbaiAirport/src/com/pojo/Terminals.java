package com.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Terminals")
public class Terminals {

	@Id
	@Column(name = "TerminalId")
	private Integer teminalId;
	
	@Column(name = "TerminalName")
	private String terminalName;
	
	@Column(name = "TerminalType")
	private String terminalType;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AirportId")
	private Airport airportObj;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Flight.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "TerminalId", referencedColumnName="TerminalId")
	private Set flightChild;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Transport.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "TerminalId", referencedColumnName="TerminalId")
	private Set transportChild;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Parking.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "TerminalId", referencedColumnName="TerminalId")
	private Set parkingChild;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Lounges.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "TerminalId", referencedColumnName="TerminalId")
	private Set loungesChild;

	public Integer getTeminalId() {
		return teminalId;
	}

	public void setTeminalId(Integer teminalId) {
		this.teminalId = teminalId;
	}

	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	
	public Airport getAirportObj() {
		return airportObj;
	}

	public void setAirportObj(Airport airportObj) {
		this.airportObj = airportObj;
	}

	public Set getFlightChild() {
		return flightChild;
	}

	public void setFlightChild(Set flightChild) {
		this.flightChild = flightChild;
	}

	public Set getTransportChild() {
		return transportChild;
	}

	public void setTransportChild(Set transportChild) {
		this.transportChild = transportChild;
	}

	public Set getParkingChild() {
		return parkingChild;
	}

	public void setParkingChild(Set parkingChild) {
		this.parkingChild = parkingChild;
	}

	public Set getLoungesChild() {
		return loungesChild;
	}

	public void setLoungesChild(Set loungesChild) {
		this.loungesChild = loungesChild;
	}	
	
}
