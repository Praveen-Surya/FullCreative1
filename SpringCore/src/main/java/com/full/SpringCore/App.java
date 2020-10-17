package com.full.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
//		Car car = new Car();
//		car.drive();
//		
//		Bike bike = new Bike();
//		bike.drive();
//
//		Vehicle vehicle = new Car();
//		vehicle.drive();
//
//		Vehicle vehicle1 = new Bike();
//		vehicle1.drive();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		
		
//		Vehicle obj = (Vehicle)context.getBean("vehicle"); // XML based configuration
//		obj.drive();
		
		Vehicle obj = (Vehicle)context.getBean("car");  // Annotation based configuration
		obj.drive();
		
		
//		Tyre tyre = (Tyre)context.getBean("tyre");  // setter injection
//		System.out.println(tyre);
		
//		Tyre tyre1 = (Tyre)context.getBean("tyre1");  // constructor injection
//		System.out.println(tyre1);
		
		
		
	}
}
