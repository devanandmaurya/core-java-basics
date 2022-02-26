package com.dkh;

public class SOPMEnULLPRINT {
//	static public void main(String args[]) {

	// public static void main(String[] args) {

	// public static void main(String []args){
	// public static void main(String arg[]) {
	
	
	float getDiscount(int price)
	{
	float discount;
	discount=price*(20/100);
	System.out.println("inside the discount method "+discount);
	return discount;
	}

	public static void main(String... asdf) {
		String [] arr={"deva", "Ajay " , "amit"};
		for(String x:arr)
		{
		System.out.println("The value of string is ::"+x);
		}
		
		String [] titles ={"Reshmi", "Bhuvan", "Priyanka", "Shoaib","Rahul"};
		for( String name : titles )
		{
		System.out.print( name );
		System.out.print(",");
		System.out.print("\n");
		}
			int i = 100;
			long l = i; //no explicit type casting required
			float f = l; //no explicit type casting required
			System.out.println("Int value "+i);
			System.out.println("Long value "+l);
			System.out.println("Float value "+f);
		System.out.println("null or NULL"); // right hai becuase statement hai
		// System.out.println(null);
		// COMPILE TIME ERROR The method println(char[]) is ambiguous for the type
		// PrintStream
	
	}
}