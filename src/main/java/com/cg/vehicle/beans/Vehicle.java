package com.cg.vehicle.beans;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle {
	private String vehicleType,aadhaarNo,mobileNo;
	private int insurancePeriod;
	private LocalDate insuranceDate;
	

	public LocalDate getInsuranceDate() {
		return insuranceDate;
	}

	public void setInsuranceDate(LocalDate insuranceDate) {
		this.insuranceDate = insuranceDate;
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

	public Vehicle(String vehicleType, String aadhaarNo, String mobileNo, int insurancePeriod, LocalDate insuranceDate) {
		super();
		this.vehicleType = vehicleType;
		this.aadhaarNo = aadhaarNo;
		this.mobileNo = mobileNo;
		this.insurancePeriod = insurancePeriod;
		this.insuranceDate = insuranceDate;
	}
	
	
	

}
