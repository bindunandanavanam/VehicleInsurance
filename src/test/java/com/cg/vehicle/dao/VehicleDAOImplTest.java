package com.cg.vehicle.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.vehicle.beans.Vehicle;

class VehicleDAOImplTest {
	VehicleDAOImpl dao=new VehicleDAOImpl();
	Vehicle vehicle=new Vehicle();

	@Test
	void testRegister() {
		vehicle.setAadhaarNo("123");
		vehicle.setInsuranceDate(java.time.LocalDate.now());
		vehicle.setInsurancePeriod(2);
		vehicle.setMobileNo("7337065675");
		vehicle.setVehicleType("2=wheeler");
		vehicle=dao.register("AP13C", vehicle);
		assertEquals(vehicle, vehicle);
	}

	@Test
	void testValidateVehicle() {
		assertEquals(vehicle,dao.validateVehicle("AP13C"));
	}

}
