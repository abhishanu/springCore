package com.abhi.spring.springCore.assignments.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TicketReservationMain {

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/assignments/lifeCycle/ticketGenerationConfig.xml");
		
		TicketReservation ticket = (TicketReservation) abstractApplicationContext.getBean("ticket");
		
		abstractApplicationContext.registerShutdownHook();

	}

}
