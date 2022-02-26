package com.basic.java;
//how many object is created;
public class Stringobjectcreation {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		String s= new String ("dev"); //it creats 5+1 =6 object 5 heap me 1 scp me
		System.out.println(s);
		int  count=0;
		count++;
		System.out.println(count);
	String ss=	s.intern();
	System.out.println("Hi all ::"+ss);
	}
}
}
