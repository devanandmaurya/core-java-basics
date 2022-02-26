package com.basic.java;

public class IntegersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000;
		int b = 1000;
		Integer aa = 9; /// wrapper class hai so equals() method apply hota hai aa and
		Integer bb = 9;
		String s = "deva";
		String ss = "deva";
		String sss = new String("a");
		String ssss = new String("a");
//		System.out.println("=================");
//		System.out.println(sss == ssss); // false   {{from == se referance  difference
//		System.out.println(sss.equals(ssss)); // true {{ contaent check kar rha hai heap se 
//		System.out.println("============================");
//	//	System.out.println("stringP:" + s == ss); // false equlas check ref For String
//		//System.out.println(s.equals(ss)); // true >> because contant check
		// System.out.println("=======int and then integers===============");
//System.out.println(a.equals(b));//Cannot invoke equals(int) on the primitive type int
//due to equlas method allow wrapper class
		System.out.println(a == b); // true
		System.out.println("==================================");
		System.out.println(aa == bb);// false
		System.out.println(aa.equals(bb)); // true
	}
}
