package com.update;

import java.text.ParseException;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.Flight;
import com.pojo.Lounges;
import com.pojo.Parking;
import com.pojo.Terminals;
import com.pojo.Transport;

public class MainUpdate {

	public static void main(String[] args) throws ParseException {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
	/*	
		Transport transport =(Transport)session.get(Transport.class, 502);
		transport.setTransportType("Cab");
	*/	
		Terminals terminals = (Terminals)session.get(Terminals.class, new Integer(102));
		terminals.setTerminalName("Sahar's Airport");
		
		Set s1 = terminals.getFlightChild();
		Iterator it1 = s1.iterator();
		while(it1.hasNext()) {
			Flight  flight = (Flight)it1.next();
		}
		
		Set s2 = terminals.getParkingChild();
		Iterator it2 = s2.iterator();
		while(it2.hasNext()) {
			Parking  parking = (Parking)it2.next();
		}
		
		Set s3 = terminals.getTransportChild();
		Iterator it3 = s3.iterator();
		while(it3.hasNext()) {
			Transport  transport = (Transport)it3.next();
		}
		
		Set s4 = terminals.getLoungesChild();
		Iterator it4 = s4.iterator();
		while(it4.hasNext()) {
			Lounges  lounges = (Lounges)it4.next();
		}
		
		//session.update(transport);
		session.update(terminals);
		ts.commit();
		System.out.println("Update Successfully..");
		session.close();
	}
}
