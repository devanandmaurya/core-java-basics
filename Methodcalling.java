package com.dkh.ABSTRACTEXAMPLE;

public class Methodcalling {
	
public static void main(String[] args) {
	int a=10;
	int b = 699;
	int c = minimumFunction(a, b);
	System.out.println("Minimum Value = " + c);
	}
	/** returns the minimum of two numbers */
	public static int minimumFunction(int n1, int n2) {
	int min;
	if (n1 > n2)
	min = n2; 
	else
	min = n1;
	return min;
	}
	}
	
