package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Weather")
public class Weather {

	@Id
	@Column(name = "WeatherId")
	private int weatherId;
	
	@Column(name = "Temperature")
	private double temperature;
	
	@Column(name = "WindSpeed")
	private double windSpeed;
	
	@Column(name = "Visibilty")
	private double visibilty;
	
	@OneToOne(targetEntity = Airport.class, cascade = CascadeType.ALL)
	@JoinColumn(name="AirportId",referencedColumnName="AirportId")
	private  Airport  parentObject;

	public int getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(int weatherId) {
		this.weatherId = weatherId;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWendSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public double getVisibilty() {
		return visibilty;
	}

	public void setVisibilty(double visibilty) {
		this.visibilty = visibilty;
	}

	public Airport getParentObject() {
		return parentObject;
	}

	public void setParentObject(Airport parentObject) {
		this.parentObject = parentObject;
	}
	
	
}
