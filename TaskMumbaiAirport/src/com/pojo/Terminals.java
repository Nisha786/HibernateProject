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
@Table(name = "Terminals")
public class Terminals {

	@Id
	@Column(name = "TerminalId")
	private int teminalId;
	
	@Column(name = "TerminalName")
	private String terminalName;
	
	@Column(name = "TerminalType")
	private String terminalType;
	
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

	public int getTeminalId() {
		return teminalId;
	}

	public void setTeminalId(int teminalId) {
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
