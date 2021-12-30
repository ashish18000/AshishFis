package com.example.CarManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarManagement.model.Car;
import com.example.CarManagement.repo.CarRepo;

@Service
public class CasrServiceImpl  implements CarService{
	
	@Autowired
	CarRepo repo;

	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		return repo.findAll();

	}

	@Override
	public Car addCar(Car car) {
		// TODO Auto-generated method stub
		return repo.save(car);
	}

	@Override
	public String deleteCar(String cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "Deleted Successfull";
	}

}
