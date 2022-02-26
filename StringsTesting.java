package com.dkh;

public class StringsTesting {
	public static void main(String[] args) {
		String a = "Arun";
		String b = " Kumar";

		String c = a.concat(b);
		System.out.println(c);

		String s = "dev";// new String("Sachin");
		String s2 = s.intern();
		System.out.println(s2);// Sachin

	}
}
