package com.cg.vehicle;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import com.cg.vehicle.beans.Vehicle;
import com.cg.vehicle.service.VehicleService;
import com.cg.vehicle.service.VehicleServiceImpl;
import com.cg.vehicle.uiexception.RegistrationException;
import com.cg.vehicle.uiexception.VehicleException;

public class App 
{
    public static void main( String[] args )
    {
    	Vehicle vehicle=new Vehicle();
    	Vehicle vehicle1=new Vehicle();
    	Vehicle vehicle2=new Vehicle();
    	String vehicleNo=null;
    	int years=0;
    	VehicleService service=new VehicleServiceImpl();
    	Scanner sc=new Scanner(System.in);
    	do {
    	System.out.println("select the choice");
        System.out.println( "1)	Vehicle Insurance Registration\n" + 
        		"2)	Insurance Validity Check\n" + 
        		"3)	Exit" );
        int ch=sc.nextInt();
        switch(ch) {
        
        case 1:
        	System.out.println("enter Vehicle No");
        	 vehicleNo=sc.next();
        	System.out.println("enter Vehicle type( 2 wheeler or 4 wheeler");
        	vehicle.setVehicleType(sc.next());
        	System.out.println("enter Insurance Period(in years)");
        	vehicle.setInsurancePeriod(sc.nextInt());
        	System.out.println("enter aadhaar card number");
        	vehicle.setAadhaarNo(sc.next());
        	System.out.println("enter mobile number");
        	vehicle.setMobileNo(sc.next());
        	vehicle=service.register(vehicleNo,vehicle);
        	if(vehicle!=null) {
        		System.out.println("your insurance registration is"+vehicle.getInsuranceDate());
        	years=	vehicle.getInsurancePeriod();
        	}
        	else {
        		try {
					throw new RegistrationException();
				} catch (RegistrationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        	
        	break;
        case 2:
        	System.out.println("enter vehicle number");
        	String vehicleNumber=sc.next();
        	vehicle=service.validateVehicle(vehicleNumber);
        	if(vehicle!=null) {
        	LocalDate date=vehicle.getInsuranceDate();
        	int n2=date.getYear();
        	 date = date.plusYears(years);
        	 int n1=date.getYear();
        	 int days=(n1-n2)*365;
        	 System.out.println("Your expiry is on");
        	 System.out.println(date);
        	 System.out.println(days+" days left for renewal");
        	}
        	else {
        		try {
					throw new VehicleException();
				} catch (VehicleException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        	break;
        case 3:
        	System.exit(0);
        }
    }while(true);
    }

	

	
}
