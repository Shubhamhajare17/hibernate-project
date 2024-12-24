package hibernateEx2;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class order {
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
		Criteria criteria=session.createCriteria(car.class);
		criteria.addOrder(Order.desc("id"));
		List<car>list=criteria.list();
		for (car car : list) {
			System.out.println(car);
	}
			
		}
		
	}


