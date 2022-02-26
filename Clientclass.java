package com.dkh;

public class Clientclass extends Employee {


	public Clientclass(String name, String address, int number) {
		super(name, address, number);
		System.out.println(name);
		System.out.println(address);
		System.out.println(number);
	}

	@Override
	public double computePay() {
		System.out.println("Emp pay");
		return 0;
	}

	public static void main(String[] args) {
System.out.println("main client class>>>>>>>>>>");

	}

}