package com.orm.run;

import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orm.model.Contact;
import com.orm.model.Dept;
import com.orm.model.Emp;
import com.orm.utils.SessionProvider;

public class HibernateMain3 {
	
	public static void main(String[] args)

	{
	SessionFactory sf = SessionProvider.getSessionFactory();
	Session session = sf.openSession();

	Transaction t = session.beginTransaction();

	Dept d = new Dept(1, "Production");
	Emp e1 = new Emp(4, "Naveen", "Chennai", "Manager");
	Emp e2 = new Emp(5, "Ram", "Indore", "Clerk");
	Emp e31 = new Emp(6, "Jason", "Jaipur", "Supervisor");

	Contact c1 = new Contact(4, "12/2", "Gandhinm Road", "984843677");
	Contact c2 = new Contact(5, "12/23", "Ganiidhi Road", "98ty843677");
	Contact c3 = new Contact(6, "12/24", "Gtyandhi Road", "9884783677");
	
	e1.setDept(d);
	e2.setDept(d);
	e31.setDept(d);
	
	e1.setContact(c1);
	e2.setContact(c2);
	e31.setContact(c3);
	
	Set<Emp> set = new HashSet<Emp>();
	set.add(e1);set.add(e2);set.add(e31);

	   

	   d.setEmployees(set);//one to many

	   

	   session.update(d);

	   t.commit();
	
	
	  
	}	 
	

}


