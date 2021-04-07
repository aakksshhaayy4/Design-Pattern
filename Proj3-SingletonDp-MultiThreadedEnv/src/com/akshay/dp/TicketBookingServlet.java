package com.akshay.dp;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p1 = Printer.getInstance();
		System.out.println(p1.hashCode());

	}

}
