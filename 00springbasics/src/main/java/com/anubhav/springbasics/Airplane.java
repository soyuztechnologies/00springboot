package com.anubhav.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Airplane {
	
	@Autowired
	@Qualifier("lap1")
	private IWings wings;
	private int planeId;
	private String Airline;
	private String FlightType;
	public Airplane() {
		System.out.println("Object Created");
	}
	public int getPlaneId() {
		return planeId;
	}
	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}
	public String getAirline() {
		return Airline;
	}
	public void setAirline(String airline) {
		Airline = airline;
	}
	public String getFlightType() {
		return FlightType;
	}
	public void setFlightType(String flightType) {
		FlightType = flightType;
	}
	public String fly() {
		System.out.println(wings.toString());
		return "Plane is on Runway and flying";
	}
}
