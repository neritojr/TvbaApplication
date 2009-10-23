/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.singleton;

import application.tvba.org.dao.HibernateSessionFactory;
import java.io.Serializable;
import java.sql.Connection;
import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.EntityMode;
import org.hibernate.Filter;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.ReplicationMode;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.stat.SessionStatistics;

/**
 *
 * @author marialvo
 */
public class HibernateFactory {
    private static HibernateFactory factory;
    private Session session;

    private HibernateFactory() {
    }

    public static HibernateFactory getInstance() {
        if (factory == null) {
            factory = new HibernateFactory();
        }

        return factory;
    }

    public Session getSession() {
        if (session == null) {
            this.session = HibernateSessionFactory.getSession();
        }

        return session;
    }

    public void closeSession() {
        session.close();
    }
}
