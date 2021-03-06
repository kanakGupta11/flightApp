package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class FlightController {
	@Autowired
	FlightService flightService;
	@GetMapping("/findall/flight")
	java.util.List<Flight> getFlight() {
		return flightService.getFlights();
	}
	@PostMapping("/search")
	java.util.List<Flight> searchFlight(@RequestBody Flight flight) {
		return flightService.searchFlightService(flight);
	}
	
	@PostMapping("/airline/inventory/add")
	String addEntry(@RequestBody Flight flight) {
		flightService.saveFlight(flight);
		return "Flight details added successfully!!";
	}
	
	
}

