package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lounges")
public class Lounges {

	@Id
	@Column(name = "LoungeId")
	private Integer loungeId;
	
	@Column(name = "LoungeName")
	private String loungeName;
	
	@Column(name = "StayeTime")
	private String stayeTime;

	public Integer getLoungeId() {
		return loungeId;
	}

	public void setLoungeId(Integer loungeId) {
		this.loungeId = loungeId;
	}

	public String getLoungeName() {
		return loungeName;
	}

	public void setLoungeName(String loungeName) {
		this.loungeName = loungeName;
	}

	public String getStayeTime() {
		return stayeTime;
	}

	public void setStayeTime(String stayeTime) {
		this.stayeTime = stayeTime;
	}
	
	
}
