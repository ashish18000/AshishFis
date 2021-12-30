package com.example.CarManagement.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")

public class Car {
	
	@Id
	String carno;
	
	@Column
	String  carowner;

	@Column
	String fueltype;
	
	@Column
	String noofseats;
	
	@Column
	String  model;
	
	public Car() {
		
	}

	public Car(String carno, String carowner, String fueltype, String noofseats, String model) {
		super();
		this.carno = carno;
		this.carowner = carowner;
		this.fueltype = fueltype;
		this.noofseats = noofseats;
		this.model = model;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getCarowner() {
		return carowner;
	}

	public void setCarowner(String carowner) {
		this.carowner = carowner;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public String getNoofseats() {
		return noofseats;
	}

	public void setNoofseats(String noofseats) {
		this.noofseats = noofseats;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
		
	

}
