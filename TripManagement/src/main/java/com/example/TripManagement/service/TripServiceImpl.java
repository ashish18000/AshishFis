package com.example.TripManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.TripManagement.model.Trip;
import com.example.TripManagement.repo.TripRepo;

@Service
public class TripServiceImpl implements TripService {
	
	@Autowired
	TripRepo repo;
	
	
	
	@Override
	public Trip add(Trip trip) {
		// TODO Auto-generated method stub
		return repo.save(trip);
	}

	@Override
	public String delete(String tripid) {
		// TODO Auto-generated method stub
		repo.deleteById(tripid);
		return "Deleted Successfull";
	}


}
