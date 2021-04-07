package com.akshay.dp;

public class Printer {
	
	//Create static instance Variable as private to store Object
	private static Printer INSTANCE;
	
	//Create Private constructor
	private Printer() {
		System.out.println("Printer.Printer()");
	}
	
	//Create one static factory method and write singleton login in that
	public static Printer getInstance() {
		//singleton logic
		if(INSTANCE==null)
			INSTANCE = new Printer();
		return INSTANCE;
		
	}
	
	//Business logic
	public void String(String msg) {
		System.out.println(msg);
	}

}
