package com.orm.run;

import java.util.List;

import javax.persistence.criteria.Order;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.orm.model.Person;
import com.orm.utils.SessionProvider;

public class Hibernaterun {
	
	public static void main(String[] args)
	{
		SessionFactory sf = SessionProvider.getSessionFactory();
		Session session = sf.openSession();
		
		//Query q = session.createQuery("from Person where name like 'A%'");
		Criteria q = session.createCriteria(Person.class);
		//Criterion c1 = Restrictions.like("name", "A%");
		org.hibernate.criterion.Order o = org.hibernate.criterion.Order.asc("name");
		q.addOrder(o);
		//q.add(c1);
		List<Person> list = q.list();
		
		for(Person x: list)
		{
			System.out.println(x.getName()+" " +x.getCity());
		}
		
		/*
		 * Transaction t = session.beginTransaction();//not for select ony inser update
		 * delete Person p = new Person(3,"Artrjun","Bghkjengaluru");
		 * session.save(p);//new object is added to hibernate t =
		 * session.beginTransaction(); Person p1 = new Person(2,"Mona","Chennai");
		 * session.saveOrUpdate(p); session.saveOrUpdate(p1); session.delete(p);
		 * t.commit(); System.out.println("New recod added");
		 * 
		 */
	}

}
