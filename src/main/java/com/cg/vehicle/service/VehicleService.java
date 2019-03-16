package com.cg.vehicle.service;

import com.cg.vehicle.beans.Vehicle;

public interface VehicleService {
	Vehicle vehicle=new Vehicle();

	Vehicle register(String vehicleNo, Vehicle vehicle);

	Vehicle validateVehicle(String vehicleNumber);

}
