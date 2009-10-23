package application.tvba.org.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateSessionFactory {
	
	private static final SessionFactory sf;
	
	static {
		try {
			sf = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (Throwable t) {
			throw new ExceptionInInitializerError(t);
		}
	}
	
	public static Session getSession() {
		return sf.openSession();
	}

}
