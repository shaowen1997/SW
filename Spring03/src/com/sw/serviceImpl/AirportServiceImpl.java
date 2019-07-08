package com.sw.serviceImpl;

import java.util.List;

import com.sw.mapper.AirportMapper;
import com.sw.pojo.Airport;
import com.sw.service.AirportService;

public class AirportServiceImpl  implements AirportService{
	private AirportMapper airportMapper;
	
	public AirportMapper getAirportMapper() {
		return airportMapper;
	}

	public void setAirportMapper(AirportMapper airportMapper) {
		this.airportMapper = airportMapper;
	}

	@Override
	public List<Airport> show() {
		
		return null;
	}

}
