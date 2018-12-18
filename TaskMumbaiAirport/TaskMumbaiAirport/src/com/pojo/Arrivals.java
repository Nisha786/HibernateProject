package com.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Arrivals")
public class Arrivals {

	@Id
	@Column(name = "ArrivalId")
	private Integer arrivalId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ArrivalDate")
	private Date arrivalDate;
	
	@Temporal(TemporalType.TIME)
    @Column(name = "ArrivalTime")
	private Date arrivalTime;
   
    @Column(name = "Status")
   	private String status;

	public Integer getArrivalId() {
		return arrivalId;
	}

	public void setArrivalId(Integer arrivalId) {
		this.arrivalId = arrivalId;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
