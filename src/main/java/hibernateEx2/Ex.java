package hibernateEx2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Ex {
	public static void main(String[] args) {
		System.out.println(1);
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println(2);
		cfg.addAnnotatedClass(car.class);
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		System.out.println(3);
		Session session= sessionfactory.openSession();
		System.out.println(4);
	//car cr=session.load(car.class, 1);
		//car cr1=new car(1,"bmw",3000000);
		//car cr1=new car(2,"thar",2500000);
		//session.save(cr1);
		//session.beginTransaction().commit();
	//System.out.println(cr);
		System.out.println(5);
		Criteria criteria=session.createCriteria(car.class);
		criteria.addOrder(Order.desc("id"));
		criteria.add(Restrictions.gt("id",50));
		List<car>list=criteria.list();
		for (car car : list) {
			System.out.println(car);
			
		}
		
				
	
	}

}
