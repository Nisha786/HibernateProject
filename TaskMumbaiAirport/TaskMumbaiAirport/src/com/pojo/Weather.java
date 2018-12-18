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
	private Integer weatherId;
	
	@Column(name = "Temperature")
	private Double temperature;
	
	@Column(name = "WindSpeed")
	private Double windSpeed;
	
	@Column(name = "Visibilty")
	private Double visibilty;
	
	@OneToOne(targetEntity = Airport.class, cascade = CascadeType.ALL)
	@JoinColumn(name="AirportId",referencedColumnName="AirportId")
	private  Airport  parentObject;

	public Integer getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(Integer weatherId) {
		this.weatherId = weatherId;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWendSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getVisibilty() {
		return visibilty;
	}

	public void setVisibilty(Double visibilty) {
		this.visibilty = visibilty;
	}

	public Airport getParentObject() {
		return parentObject;
	}

	public void setParentObject(Airport parentObject) {
		this.parentObject = parentObject;
	}
	
	
}
