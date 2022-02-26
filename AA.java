package com.dkh;

// WHAT IS THE OUTPUT OF THAT ?
// tHIS IS STRING CLASS >>>> BECAUSE STRING IS MORE SPECFIC SO COMPILER 
//DEFIED MORE SPECIFIC METHOD THAT OBJECT AND STRIGN 
public class AA {
	public static void main(String[] args) {

		test(null);
	}

	public static void test(Object o) {
		System.out.println("object class it is ");
	}

	public static void test(String s) {
		System.out.println("This is string class");

	}
}
