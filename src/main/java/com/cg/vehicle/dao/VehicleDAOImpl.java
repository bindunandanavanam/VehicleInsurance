package com.cg.vehicle.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.cg.vehicle.beans.Vehicle;

public class VehicleDAOImpl implements VehicleDAO {
	Vehicle vehicle=new Vehicle();
	Map<String, Vehicle> VehicleEntry;
	public Vehicle register(String vehicleNo, Vehicle vehicle) {
		 VehicleEntry= new HashMap<String,Vehicle >();
		 System.out.println(java.time.LocalDate.now());
		 LocalDate date = java.time.LocalDate.now();
		 vehicle.setInsuranceDate(date);
		
		VehicleEntry.put(vehicleNo, new Vehicle(vehicle.getVehicleType(), vehicle.getAadhaarNo()
				, vehicle.getMobileNo(), vehicle.getInsurancePeriod(),vehicle.getInsuranceDate()));
		 
		
		return vehicle;
	}
	
	public Vehicle validateVehicle(String vehicleNumber) {
		int c = 0;
		for (Map.Entry m : VehicleEntry.entrySet()) {
			if (m.getKey().equals(vehicleNumber)) {
				vehicle = (Vehicle) m.getValue();
				c++;
				break;
			}
		}
		System.out.println("welcome");
		if (c == 0) {
			return null;
		} else {
			return vehicle;
		}
		
	}
		

}
