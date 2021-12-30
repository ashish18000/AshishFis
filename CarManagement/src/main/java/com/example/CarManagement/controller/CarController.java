package com.example.CarManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarManagement.model.Car;
import com.example.CarManagement.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	
	CarService service;
	
	
	@GetMapping("/car/all")
	public List<Car> getAllCar() {


		return service.getAllCar();

	}
	
	@PostMapping("/car/add")
	public Car addCar(@RequestBody Car car) {
		return service.addCar(car);
	}
	
	@DeleteMapping("/car/delete/{cid}")
	public String deleteCar(@PathVariable("cid") String cid) {
		return service.deleteCar(cid);
		
	}


}
