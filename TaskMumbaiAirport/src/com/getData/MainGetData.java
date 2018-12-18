package com.getData;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.Airport;
import com.pojo.Arrivals;
import com.pojo.CarRental;
import com.pojo.Departures;
import com.pojo.Flight;
import com.pojo.Hotels;
import com.pojo.Terminals;

public class MainGetData {

	public static void main(String[] args) throws ParseException {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
	/*	Airport airport = (Airport)session.get(Airport.class, new Integer(1));
		System.out.println(airport.getAirportId()+"\t"+ airport.getAirportName()+"\t"+ airport.getCity());

		Set s = airport.getFlightSet();
		Iterator it = s.iterator();
		System.out.println("---------------------------");
		while(it.hasNext())
		{
        Flight flight = (Flight)it.next();
		System.out.println(flight.getFlightId()+"\t"+flight.getFlightName()+"\t"+ flight.getFlightName()+"\t"+flight.getFlightType());
		System.out.println("---------------------------");
		}
    */
    /*		
		Query qry = session.createQuery("from Airport");
		List l1 = qry.list();
		Iterator it1 = l1.iterator();

		while(it1.hasNext())
		{
		Airport airport = (Airport)it1.next();
		System.out.println(airport.getAirportId()+"\t"+ airport.getAirportName()+"\t"+ airport.getCity());

		Set s1 = airport.getTerminalChild();
		Iterator it2 = s1.iterator();
        while(it2.hasNext())
		{
		Terminals terminals = (Terminals) it2.next();
		System.out.println(terminals.getTeminalId()+"\t"+terminals.getTerminalName()+ "\t"+terminals.getTerminalType());
		}
        System.out.println("-----------------------------------------");
       
        Set s2 = airport.getFlightSet();
        Iterator it3 = s2.iterator();
        while(it3.hasNext())
        {
        Flight flight = (Flight)it3.next();
     	System.out.println(flight.getFlightId()+"\t"+flight.getFlightName()+"\t"+ flight.getFlightName()+"\t"+flight.getFlightType());
   		}
        System.out.println("-----------------------------------------");
        
        Set s3 = airport.getArrivalsChild();
        Iterator it4 = s3.iterator();
        while(it4.hasNext())
        {
        Arrivals arrivals = (Arrivals)it4.next();
     	System.out.println(arrivals.getArrivalId()+"\t"+ arrivals.getArrivalDate()+"\t"+ arrivals.getArrivalTime()+"\t"+arrivals.getStatus());
   		}
        System.out.println("-----------------------------------------");
        
        Set s4 = airport.getDeparturChild();
        Iterator it5 = s4.iterator();
        while(it5.hasNext())
        {
        Departures departures = (Departures)it5.next();
     	System.out.println(departures.getDeparturId()+"\t"+ departures.getDeparturDate()+"\t"+ departures.getDeparturTime()+"\t"+ departures.getStatus());
   		}
        System.out.println("-----------------------------------------");
        
	}    */
		
   		
		Criteria cri1 = session.createCriteria(Hotels.class);
		List l1 = cri1.list();
		Iterator it1 = l1.iterator();
		while(it1.hasNext()) {
			Hotels  hotels = (Hotels)it1.next();
			System.out.println(hotels.getHotelId()+"\t"+hotels.getHotelName()+"\t"+hotels.getStar()+"\t"+hotels.getDistance()+"\t"+hotels.getAddress());
			Airport airport = hotels.getAirportObject();
			System.out.println(airport.getAirportId()+"\t"+ airport.getAirportName()+"\t"+ airport.getCity());
			System.out.println("------------------------------------");
		}
		
		Criteria cri = session.createCriteria(CarRental.class);
		List l = cri.list();
		Iterator it = l.iterator();
		while(it.hasNext()) {
			CarRental  carRental = (CarRental)it.next();
			System.out.println(carRental.getCarRentalId()+"\t"+carRental.getDrop_Off()+"\t"+carRental.getPassengers()+"\t"+carRental.getPickUp_Date()+"\t"+carRental.getPickUp_Time()+"\t"+carRental.getReturn_Date()+"\t"+carRental.getReturn_Time());
			Airport airport = carRental.getAirportObject();
			System.out.println(airport.getAirportId()+"\t"+ airport.getAirportName()+"\t"+ airport.getCity());
			System.out.println("------------------------------------");
		}
		
		
         System.out.println("Get Data Successfully..");
		session.close();
	}
}
