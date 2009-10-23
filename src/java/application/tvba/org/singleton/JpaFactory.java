/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application.tvba.org.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author neritobaldojunior
 *
 *
 */
public class JpaFactory {

    private static JpaFactory factory;
    private EntityManagerFactory eMFactory;

    private JpaFactory() {
    }

    public static JpaFactory getInstance() {
        if (factory == null) {
            factory = new JpaFactory();
        }

        return factory;
    }

    public EntityManager getEntityManager(String nomeUnidade) {
        if (eMFactory == null) {
            eMFactory = Persistence.createEntityManagerFactory(nomeUnidade);
        }

        return eMFactory.createEntityManager();
    }

    public void closeEntityManager() {
        eMFactory.close();
    }
}
