package com.full.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;

//	public Tyre(String brand) { 
//		this.brand = brand;
//	}

//	@Override
//	public String toString() {
//		return "Tyre [brand=" + brand + "]";
//	}
 
	@Override
	public String toString() {
		return "Its Working";
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
