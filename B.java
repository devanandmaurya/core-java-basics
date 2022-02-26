package com.dkh;

abstract class A {

	abstract void callme();

	public void show() {
		System.out.println("dk show");
	}
}

class B extends StringsTesting {
	void callme() {
		System.out.println("this is callme. by abstract class impl");
	}

	public static void main(String[] args) {
		B b = new B();
		b.callme();
		// StringsTesting a = new StringsTesting();
		StringsTesting a = new B();
		((B) a).callme();
		//a.show();
	
	}
}
