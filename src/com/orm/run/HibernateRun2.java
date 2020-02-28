package com.orm.run;

import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.orm.model.Dept;
import com.orm.model.Emp;
import com.orm.utils.SessionProvider;

public class HibernateRun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = SessionProvider.getSessionFactory();
		Session session = sf.openSession();
		
		Query q = session.createQuery("from Dept");
		List<Dept> list = q.list();
		for(Dept d : list)
		{
			System.out.println(d.getName());
			System.out.println("-------------------------");
			for(Emp x:d.getEmployees())
			{
				System.out.println(x.getName() + " " +x.getCity());
			}
		}
		/*
		 * Transaction t = session.beginTransaction();
		 * 
		 * Dept d = new Dept(1, "Production"); Emp e1 = new
		 * Emp(1,"Naveen","Chennai","Manager"); Emp e2 = new
		 * Emp(2,"Ram","Indore","Clerk"); Emp e3 = new
		 * Emp(3,"Jason","Jaipur","Supervisor"); e1.setDept(d); e2.setDept(d);
		 * e3.setDept(d);
		 * 
		 * Set<Emp> empSet = new HashSet<Emp>(); empSet.add(e1); empSet.add(e2);
		 * empSet.add(e3);
		 * 
		 * d.setEmployees(empSet); session.save(d); t.commit();
		 */
	}

}

