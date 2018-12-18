package com.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Departurs")
public class Departures {

	@Id
	@Column(name = "DeparturId")
	private int departurId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DeparturDate")
	private Date departurDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "DeparturTime")
	private Date departurTime;
	
    @Column(name = "Status")
    private String status;

	public int getDeparturId() {
		return departurId;
	}

	public void setDeparturId(int departurId) {
		this.departurId = departurId;
	}

	public Date getDeparturDate() {
		return departurDate;
	}

	public void setDeparturDate(Date departurDate) {
		this.departurDate = departurDate;
	}

	public Date getDeparturTime() {
		return departurTime;
	}

	public void setDeparturTime(Date departurTime) {
		this.departurTime = departurTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
