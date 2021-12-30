package com.example.CarManagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarManagement.model.Car;

@Repository
@Transactional

public interface CarRepo extends JpaRepository<Car,String> {
	

}
