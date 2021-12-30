package com.example.TripManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TripManagement.model.Trip;
import com.example.TripManagement.service.TripService;



@RestController
public class TripController {
	
@Autowired
	
	TripService service;

	@PostMapping("/trip/add")
	public Trip add(@RequestBody Trip trip) {
	return service.add(trip);
}

	@DeleteMapping("/trip/delete/{tripid}")
	public String delete(@PathVariable("tripid") String tripid) {
	return service.delete(tripid);
	
}
	
	


}
