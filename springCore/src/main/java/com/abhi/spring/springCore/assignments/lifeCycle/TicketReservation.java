package com.abhi.spring.springCore.assignments.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int ticketNo;
	
	@PostConstruct
	public void init(){
		System.out.println("Genrating Ticket...");
	}
	
	@PreDestroy
	public void end(){
		System.out.println("Ticket Generation completed....");
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		System.out.println("Generating new ticket no:"+ticketNo);
		this.ticketNo = ticketNo;
	}
}
