package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

 

        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Customer i = new Customer();

 

        i.setCid(12);
        i.setCname("Bhavya");
        i.setPlace("NEwDelhi");
        i.setPAN("b779");

 

        session.save(i);
        tx.commit();

 

        System.out.println("Details Added!");

    }
	
	
	
	
	}


