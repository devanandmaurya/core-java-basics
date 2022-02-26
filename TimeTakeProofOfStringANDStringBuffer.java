package com.dkh;

public class TimeTakeProofOfStringANDStringBuffer {
//	public static void main(String args[])
//	{
//		
//		String str = "Hello World";
//		System.out.println(str.toString());
//		TimeTakeProofOfStringANDStringBuffer c=new TimeTakeProofOfStringANDStringBuffer();
//	System.out.println(c);
//	}
//	public String toString()
//	{
//	return "This is my car object";
//	}
//	}

	


	public static String concatWithString() {
		String t = "Java";
		for (int i = 0; i < 10000; i++) {

			t = t + "Study";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Study");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}