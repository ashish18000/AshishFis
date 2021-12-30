package com.example.TripManagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TripManagement.model.Trip;

@Repository
@Transactional

public interface TripRepo extends JpaRepository<Trip,String> {

	
}
