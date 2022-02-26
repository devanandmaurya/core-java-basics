package com.dkh.ABSTRACTEXAMPLE;

abstract public class Vehicle {
	abstract void start();
	void show() { //show method only call by super keywords
		
		System.out.println("normal method of vehcile");
	}
}

class Car extends Vehicle {

	@Override
	void start() {
		super.show(); //to call normal method of abstract class write this 
		System.out.println("car is start by key");
	}
}

class Scooter extends Vehicle {

	@Override
	void start() {
		super.show();
		System.out.println("scooter start by kick");
	}
}