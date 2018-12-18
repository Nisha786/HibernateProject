package com.create;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.Airport;
import com.pojo.Arrivals;
import com.pojo.CarRental;
import com.pojo.Departures;
import com.pojo.Flight;
import com.pojo.Hotels;
import com.pojo.Lounges;
import com.pojo.Parking;
import com.pojo.Services;
import com.pojo.Terminals;
import com.pojo.Transfers;
import com.pojo.Transport;
import com.pojo.Weather;

public class MainCreate {

	public static void main(String[] args) throws ParseException {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();

		// Airport
		Airport airport1 = new Airport();
		airport1.setAirportId(1);
		airport1.setAirportName("Chhatrapati Shivaji International Airport");
		airport1.setCity("Mumbai");

		Airport airport2 = new Airport();
		airport2.setAirportId(2);
		airport2.setAirportName("Indira Gandhi International Airport");
		airport2.setCity("Delhi");

		Airport airport3 = new Airport();
		airport3.setAirportId(3);
		airport3.setAirportName("Kuala Lumpur International Airport");
		airport3.setCity("Kuala Lumpur");

		// Terminals
		Terminals terminals1 = new Terminals();
		terminals1.setTeminalId(101);
		terminals1.setTerminalName("Santacruz Airport");
		terminals1.setTerminalType("Domestic Terminal");
		terminals1.setAirportObj(airport1);

		Terminals terminals2 = new Terminals();
		terminals2.setTeminalId(102);
		terminals2.setTerminalName("Sahar Airport");
		terminals2.setTerminalType("International");
		terminals2.setAirportObj(airport1);
		Set s1 = new HashSet();
		s1.add(terminals1);
		s1.add(terminals2);
		airport1.setTerminalChild(s1);

		// Flight
		Flight flight1 = new Flight();
		flight1.setFlightId(201);
		flight1.setFlightName("6E 6936");
		flight1.setCarrier("IndiGo");
		flight1.setFlightType("Domestic");

		Flight flight2 = new Flight();
		flight2.setFlightId(202);
		flight2.setFlightName("9W 419");
		flight2.setCarrier("Jet Airways");
		flight2.setFlightType("Domestic");
		Set s2 = new HashSet();
		s2.add(flight1);
		s2.add(flight2);
		terminals1.setFlightChild(s2);

		Flight flight3 = new Flight();
		flight3.setFlightId(203);
		flight3.setFlightName("MH 174");
		flight3.setCarrier("Malaysia Airlines");
		flight3.setFlightType("International");

		Flight flight4 = new Flight();
		flight4.setFlightId(204);
		flight4.setFlightName("KU 303");
		flight4.setCarrier("Kuwait Airways");
		flight4.setFlightType("International");
		Set s3 = new HashSet();
		s3.add(flight3);
		s3.add(flight4);
		terminals2.setFlightChild(s3);

		Set s4 = new HashSet();
		s4.add(flight1);
		s4.add(flight2);
		s4.add(flight3);
		s4.add(flight4);
		airport1.setFlightSet(s4);

		Set s5 = new HashSet();
		s5.add(flight1);
		s5.add(flight2);
		s5.add(flight3);
		airport2.setFlightSet(s5);

		Set s6 = new HashSet();
		s6.add(flight4);
		s6.add(flight3);
		airport3.setFlightSet(s6);

		// Arrivals
		Arrivals arrivals1 = new Arrivals();
		arrivals1.setArrivalId(1001);
		arrivals1.setArrivalDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		arrivals1.setArrivalTime(new SimpleDateFormat("HH:mm:ss").parse("15:30:14"));
		arrivals1.setStatus("OnTime");

		Arrivals arrivals2 = new Arrivals();
		arrivals2.setArrivalId(1002);
		arrivals2.setArrivalDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		arrivals2.setArrivalTime(new SimpleDateFormat("HH:mm:ss").parse("05:30:15"));
		arrivals2.setStatus("Delayed");

		Set s7 = new HashSet();
		s7.add(arrivals1);
		s7.add(arrivals2);
		airport2.setArrivalsChild(s7);

		Arrivals arrivals3 = new Arrivals();
		arrivals3.setArrivalId(1003);
		arrivals3.setArrivalDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		arrivals3.setArrivalTime(new SimpleDateFormat("HH:mm:ss").parse("18:15:00"));
		arrivals3.setStatus("Delayed");

		Arrivals arrivals4 = new Arrivals();
		arrivals4.setArrivalId(1004);
		arrivals4.setArrivalDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		arrivals4.setArrivalTime(new SimpleDateFormat("HH:mm:ss").parse("22:00:00"));
		arrivals4.setStatus("OnTime");

		Set s8 = new HashSet();
		s8.add(arrivals3);
		s8.add(arrivals4);
		airport3.setArrivalsChild(s8);

		Set s9 = new HashSet();
		s9.add(arrivals1);
		flight1.setArrivalsChild(s9);

		Set s10 = new HashSet();
		s10.add(arrivals2);
		flight2.setArrivalsChild(s10);

		Set s11 = new HashSet();
		s11.add(arrivals3);
		flight3.setArrivalsChild(s11);

		Set s12 = new HashSet();
		s12.add(arrivals4);
		flight4.setArrivalsChild(s12);

		// Departures
		Departures departures1 = new Departures();
		departures1.setDeparturId(2001);
		departures1.setDeparturDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		departures1.setDeparturTime(new SimpleDateFormat("HH:mm:ss").parse("23:00:00"));
		departures1.setStatus("OnTime");

		Departures departures2 = new Departures();
		departures2.setDeparturId(2002);
		departures2.setDeparturDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		departures2.setDeparturTime(new SimpleDateFormat("HH:mm:ss").parse("10:30:00"));
		departures2.setStatus("Delayed");

		Set s13 = new HashSet();
		s13.add(departures1);
		s13.add(departures2);
		airport2.setDeparturChild(s13);

		Departures departures3 = new Departures();
		departures3.setDeparturId(2003);
		departures3.setDeparturDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		departures3.setDeparturTime(new SimpleDateFormat("HH:mm:ss").parse("4:15:00"));
		departures3.setStatus("Delayed");

		Departures departures4 = new Departures();
		departures4.setDeparturId(2004);
		departures4.setDeparturDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		departures4.setDeparturTime(new SimpleDateFormat("HH:mm:ss").parse("12:45:00"));
		departures4.setStatus("OnTime");

		Set s14 = new HashSet();
		s14.add(departures3);
		s14.add(departures4);
		airport3.setDeparturChild(s14);

		Set s15 = new HashSet();
		s15.add(departures1);
		flight1.setDeparturChild(s15);

		Set s16 = new HashSet();
		s16.add(departures2);
		flight2.setDeparturChild(s16);

		Set s17 = new HashSet();
		s17.add(departures3);
		flight3.setDeparturChild(s17);

		Set s18 = new HashSet();
		s18.add(departures4);
		flight4.setDeparturChild(s18);

		// Transport
		Transport transport1 = new Transport();
		transport1.setTransportId(501);
		transport1.setTransportType("Rickshaw");

		Transport transport2 = new Transport();
		transport2.setTransportId(502);
		transport2.setTransportType("Taxi");

		Transport transport3 = new Transport();
		transport3.setTransportId(503);
		transport3.setTransportType("Bus");

		Transport transport4 = new Transport();
		transport4.setTransportId(504);
		transport4.setTransportType("Train");

		Set s19 = new HashSet();
		s19.add(transport1);
		s19.add(transport2);
		s19.add(transport3);
		s19.add(transport4);
		terminals1.setTransportChild(s19);

		Set s20 = new HashSet();
		s20.add(transport1);
		s20.add(transport2);
		s20.add(transport3);
		s20.add(transport4);
		terminals2.setTransportChild(s20);

		// Parking
		Parking parking1 = new Parking();
		parking1.setParkingId(3001);
		parking1.setParkingType("Four Wheeler");
		parking1.setStrength(740);

		Parking parking2 = new Parking();
		parking2.setParkingId(3002);
		parking2.setParkingType("Two Wheeler");
		parking2.setStrength(300);

		Set s21 = new HashSet();
		s21.add(parking1);
		s21.add(parking2);
		terminals1.setParkingChild(s21);

		Parking parking3 = new Parking();
		parking3.setParkingId(3003);
		parking3.setParkingType("Four Wheeler");
		parking3.setStrength(4700);

		Parking parking4 = new Parking();
		parking4.setParkingId(3004);
		parking4.setParkingType("Two Wheeler");
		parking4.setStrength(500);

		Set s22 = new HashSet();
		s22.add(parking3);
		s22.add(parking4);
		terminals2.setParkingChild(s22);

		// Lounges
		Lounges lounges1 = new Lounges();
		lounges1.setLoungeId(4001);
		lounges1.setLoungeName("Aviserv Lounge");
		lounges1.setStayeTime("3-6 Hours");
		Set s23 = new HashSet();
		s23.add(lounges1);
		terminals1.setLoungesChild(s23);

		Lounges lounges2 = new Lounges();
		lounges2.setLoungeId(4002);
		lounges2.setLoungeName("Travel Club");
		lounges2.setStayeTime("1-3 Hours");

		Lounges lounges3 = new Lounges();
		lounges3.setLoungeId(4003);
		lounges3.setLoungeName("Travel Club2");
		lounges3.setStayeTime("3-9 Hours");
		Set s24 = new HashSet();
		s24.add(lounges2);
		s24.add(lounges3);
		terminals2.setLoungesChild(s24);

		// Services
		Services services1 = new Services();
		services1.setServiceId(5001);
		services1.setWifi("Available");
		services1.setChildrenRoom("Available");
		services1.setBabyStrollers("Not Available");
		services1.setFoodArea("Not Available");
		services1.setMedicalCentre("Available");
		services1.setPrayerRooms("Available");
		services1.setLostLuggage("Available");
		services1.setBanksATMs("Available");
		services1.setParentObject(terminals1);

		Services services2 = new Services();
		services2.setServiceId(5002);
		services2.setWifi("Available");
		services2.setChildrenRoom("Available");
		services2.setBabyStrollers("Available");
		services2.setFoodArea("Available");
		services2.setMedicalCentre("Available");
		services2.setPrayerRooms("Available");
		services2.setLostLuggage("Available");
		services2.setBanksATMs("Available");
		services2.setParentObject(terminals2);
		
		// Weather
		Weather weather = new Weather();
		weather.setWeatherId(6001);
		weather.setTemperature(28.45);
		weather.setVisibilty(2.3);
		weather.setWendSpeed(9.2);
		weather.setParentObject(airport1);
		
		// CarRental
		CarRental carRental1 = new CarRental();
		carRental1.setCarRentalId(7001);
		carRental1.setDrop_Off("Thane");
		carRental1.setPickUp_Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		carRental1.setPickUp_Time(new SimpleDateFormat("HH:mm:ss").parse("15:30:00"));
		carRental1.setReturn_Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-11"));
		carRental1.setReturn_Time(new SimpleDateFormat("HH:mm:ss").parse("22:45:00"));
		carRental1.setPassengers(3);
		carRental1.setAirportObject1(airport1);
		
		CarRental carRental2 = new CarRental();
		carRental2.setCarRentalId(7002);
		carRental2.setDrop_Off("Juhu Chopati");
		carRental2.setPickUp_Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-8"));
		carRental2.setPickUp_Time(new SimpleDateFormat("HH:mm:ss").parse("7:00:00"));
		carRental2.setReturn_Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-11"));
		carRental2.setReturn_Time(new SimpleDateFormat("HH:mm:ss").parse("18:15:00"));
		carRental2.setPassengers(2);
		carRental2.setAirportObject1(airport1);
		
		// Hotels
		Hotels hotels1 = new Hotels();
		hotels1.setHotelId(8001);
		hotels1.setHotelName("Waterstones Hotel");
		hotels1.setAddress("Mumbai");
		hotels1.setStar(5);
		hotels1.setDistance("2-3 KM");
		hotels1.setAirportObject2(airport1);
		
		Hotels hotels2 = new Hotels();
		hotels2.setHotelId(8002);
		hotels2.setHotelName("Hyatt Regency Mumbai");
		hotels2.setAddress("Mumbai");
		hotels2.setStar(5);
		hotels2.setDistance("1-2 KM");
		hotels2.setAirportObject2(airport1);
		
		// Transfers
		Transfers transfers1 = new Transfers();
		transfers1.setTransferId(9001);
		transfers1.setWehicalType("XUV");
		transfers1.setRate(450.0);
		transfers1.setAirportObject(airport1);
		
		Transfers transfers2 = new Transfers();
		transfers2.setTransferId(9002);
		transfers2.setWehicalType("Innova");
		transfers2.setRate(450.0);
		transfers2.setAirportObject(airport1);
		Set s25 = new HashSet();
		s25.add(transfers1);
		s25.add(transfers2);
		airport1.setTransfersChild(s25);
		

		session.save(airport1);
		session.save(airport2);
		session.save(airport3);
		session.save(terminals1);
		session.save(terminals2);
		session.save(flight1);
		session.save(flight2);
		session.save(flight3);
		session.save(flight4);
		session.save(services1);
		session.save(services2);
		session.save(weather);
		session.save(carRental1);
		session.save(carRental2);
		session.save(hotels1);
		session.save(hotels2);
		session.save(transfers1);
		session.save(transfers2);
		ts.commit();
		System.out.println("Saved Successfully..");
		session.close();
	}

}
