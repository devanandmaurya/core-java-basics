package com.basic.java.interfacs.imp;

public class TestInterface implements Test1, Test2 {
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(
				"i am in show test 1 method and test2 " + "is override here due to no argument in same method");
	}

	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		System.out.println("here java interface test1 one mehode show "
				+ "call due to it overrid the test2 show method and the rules is it follows the left to right apporach for the java "
				+ " interface implementation case but in case of method overloading it show diamond problem  for that diamond prombem reduced interface"
				+ " concept comes into the pictures ");
		t.show();
	}
}
