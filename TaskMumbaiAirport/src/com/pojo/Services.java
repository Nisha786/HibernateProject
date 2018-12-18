package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Services")
public class Services {

	@Id
	@Column(name = "ServiceId")
	private int serviceId;
	
	@Column(name = "Wifi")
	private String wifi;
	
	@Column(name = "Children_Rooms")
	private String childrenRoom;
	
	@Column(name = "Baby_Strollers")
	private String babyStrollers;
	
	@Column(name = "Food_Area")
	private String foodArea;
	
	@Column(name = "Prayer_Rooms")
	private String prayerRooms;
	
	@Column(name = "Medical_Centre")
	private String medicalCentre;
	
	@Column(name = "Lost_Luggage")
	private String lostLuggage;
	
	@Column(name = "Banks_and_ATMs")
	private String banksATMs;
	
	@OneToOne(targetEntity = Terminals.class, cascade = CascadeType.ALL)
	@JoinColumn(name="TerminalId",referencedColumnName="TerminalId")
	private  Terminals  parentObject;

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getChildrenRoom() {
		return childrenRoom;
	}

	public void setChildrenRoom(String childrenRoom) {
		this.childrenRoom = childrenRoom;
	}

	public String getBabyStrollers() {
		return babyStrollers;
	}

	public void setBabyStrollers(String babyStrollers) {
		this.babyStrollers = babyStrollers;
	}

	public String getFoodArea() {
		return foodArea;
	}

	public void setFoodArea(String foodArea) {
		this.foodArea = foodArea;
	}

	public String getPrayerRooms() {
		return prayerRooms;
	}

	public void setPrayerRooms(String prayerRooms) {
		this.prayerRooms = prayerRooms;
	}

	public String getMedicalCentre() {
		return medicalCentre;
	}

	public void setMedicalCentre(String medicalCentre) {
		this.medicalCentre = medicalCentre;
	}

	public String getLostLuggage() {
		return lostLuggage;
	}

	public void setLostLuggage(String lostLuggage) {
		this.lostLuggage = lostLuggage;
	}

	public String getBanksATMs() {
		return banksATMs;
	}

	public void setBanksATMs(String banksATMs) {
		this.banksATMs = banksATMs;
	}

	public Terminals getParentObject() {
		return parentObject;
	}

	public void setParentObject(Terminals parentObject) {
		this.parentObject = parentObject;
	}

	
	
}
