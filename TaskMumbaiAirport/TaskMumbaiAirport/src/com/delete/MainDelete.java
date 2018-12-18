package com.delete;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.Terminals;

public class MainDelete {

	public static void main(String[] args) throws ParseException {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();

		// Deleting Single Parent Object With All Child
		// Terminals terminals = (Terminals)session.get(Terminals.class, new
		// Integer(102));

		// Deleting All Parent Objects With All Childs
        Query qry = session.createQuery("from Terminals");
		List l = qry.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
		Terminals terminals = (Terminals) it.next();
		session.delete(terminals);
		}

		//session.delete(terminals);
		ts.commit();
		System.out.println("Deleted Successfully..");
		session.close();
	}
}
