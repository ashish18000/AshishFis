package com.example.CarManagement.service;

import java.util.List;

import com.example.CarManagement.model.Car;


public interface CarService {
	
	public List<Car> getAllCar();
	public Car addCar(Car car);
	public String deleteCar(String cid);
	

}
