package com.vin.auto.learn;

public class PrintLastFiveLetters {

	public static void main(String[] args) {
	
		String v = "vinayGondhkar";
		String print ="";
		for(int i=4;i>v.length();i++) {
			print = print + v.charAt(i);
		}
		System.out.println(print);
	}
	

}
