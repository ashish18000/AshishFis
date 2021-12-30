package com.example.TripManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trip")


public class Trip {
	
	@Id
	String tripid;
	
	@Column
	String  carno;

	@Column
	String source;
	
	@Column
	String customername;
	
	@Column
	int amount  ;
	
	
	public Trip() {
				
	}


	public Trip(String tripid, String carno, String source, String customername, int amount) {
		super();
		this.tripid = tripid;
		this.carno = carno;
		this.source = source;
		this.customername = customername;
		this.amount = amount;
	}


	public String getTripid() {
		return tripid;
	}


	public void setTripid(String tripid) {
		this.tripid = tripid;
	}


	public String getCarno() {
		return carno;
	}


	public void setCarno(String carno) {
		this.carno = carno;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	
	

}
