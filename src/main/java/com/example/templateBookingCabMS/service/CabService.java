package com.example.templateBookingCabMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.templateBookingCabMS.model.Cab;

public interface CabService {

	Cab bookCab(Cab cab);
	
	Optional<Cab> getCabById(Integer Id);
	List<Cab> getAllBookedCabs();
	
	void deleteCab(Integer id);
}
