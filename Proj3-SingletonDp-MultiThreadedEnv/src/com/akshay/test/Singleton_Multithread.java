package com.akshay.test;

import com.akshay.dp.TicketBookingServlet;

public class Singleton_Multithread {

	public static void main(String[] args) {
		
		TicketBookingServlet servlet = new TicketBookingServlet();
		Thread t1 = new Thread(servlet);
		Thread t2 = new Thread(servlet);
		Thread t3 = new Thread(servlet);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
