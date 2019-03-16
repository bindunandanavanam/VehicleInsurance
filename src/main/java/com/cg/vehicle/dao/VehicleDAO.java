package com.cg.vehicle.dao;

import com.cg.vehicle.beans.Vehicle;

public interface VehicleDAO {
	Vehicle register(String vehicleNo, Vehicle vehicle);
	Vehicle validateVehicle(String vehicleNumber);

}
