package com.Test;

import java.security.Provider.Service;
import java.util.Scanner;

public class vehicle {
	private String name;
	private long number;
	private String vehicleType;
	public vehicle(String name, long number, String vehicletype, String vehicleType) {
		super();
		this.name=name;
		this.number=number;
		this.vehicleType=vehicleType;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public void profileDetails() {
	System.out.println("Vahicle Oner Name :"+ name);
	System.out.println("Vahicle Number :"+ number);
	System.out.println("Vahicle Type :"+ vehicleType);
	
	}	
}



class Servicevehicle extends vehicle{
	private static final String Number = null;
	private static final char[] Category = null;
	private static final boolean Service = false;
	private String serviceCenterName;
	private String serviceCategory;
	public Servicevehicle(String name, long number, String vehicletype, String serviceCenterName,
			String serviceCategory) {
		super(name, number, vehicletype, serviceCategory);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("vehicle profile has been created.");
		
	}
	public String getServiceCenterName() {
		return serviceCenterName;
	}
	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}
	public String getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	
	public void updatedServiceCenter(String center) {
		 if(center== null && center.equals("")) {
			System.out.println("invalid service update");
		 }else {
			this.serviceCenterName=center;
		}
	}
	public void updatedServiceCategory(String category) {
		if(category== null && category.equals("")) {
			System.out.println("invalid Category.....");
		 }else {
			 this.serviceCategory=category;
		 }
		}
	public void vehicleDetails() {
		
        profileDetails();
        System.out.println(Service Center Name:"+ serviceCenterName");
        System.out.println(Service Category:"+ serviceCategory");
		
	
		
		
	}
	
	
}
public class Example2{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter number:");
		long number=sc.nextLong();
		
		System.out.println("Enter VehicleType:");
		String type=sc.nextLine();
		
		sc.nextLine();
		System.out.println("Enter service center name:");
		String center=sc.nextLine();
		
		System.out.println("Enter Category:");
		String category=sc.nextLine();
		
		
		
		Service sv=new Service(name, number, type, center, category);
		   
		  int option=0;
		  boolean result=true;
		  
		  while(result) {
			  System.out.println("Provide a menu to perform the following operations:\r\n"
				+ "1.Update Service Category\r\n"
				 +"2.Update Service Center Name\r\n"
				 +"3.View Vehicle Profile Details\r\n"
				  +"4.Exit the program\r\n"
				 +"");
			  option=sc.nextInt();
			  switch(option) {
			  case 1:{
				System.out.println("Updated service category:");
				String categorys=sc.nextLine();
				 sv.updatedService Category(category);
			  
				  break;
			  }
				  
				  default:System.out.println("Hello");
					  break;
			  
		  }
		sc.close();
		
	}
}











