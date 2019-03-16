package com.cg.vehicle.service;

import com.cg.vehicle.beans.Vehicle;
import com.cg.vehicle.dao.VehicleDAO;
import com.cg.vehicle.dao.VehicleDAOImpl;

public class VehicleServiceImpl implements VehicleService{
	VehicleDAO dao=new VehicleDAOImpl();
	Vehicle vehicle=new Vehicle();
	public Vehicle register(String vehicleNo, Vehicle vehicle) {
		vehicle=dao.register(vehicleNo,vehicle);
		return vehicle;
	}
	public Vehicle validateVehicle(String vehicleNumber) {
		vehicle=dao.register(vehicleNumber, vehicle);
		return vehicle;
	}

}
