/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.jpa;

import application.tvba.org.dao.interfaces.DatabaseDao;
import application.tvba.org.entity.Banco;
import application.tvba.org.singleton.JpaFactory;
import java.util.Collection;
import javax.persistence.EntityManager;

/**
 *
 * @author neritobaldojunior
 *
 * Classe responsável por realizar as transações do objeto Database com o banco, utilizando conexão JPA.
 * A classe implementa uma interface, que define os métodos a serem implementados.
 * 
 */
public class JpaDatabaseDao implements DatabaseDao {

    public static final String UNIT = "TvbaPersistence";

    public boolean gravarDatabaseDao(Banco banco) {

        EntityManager manager = null;
        try{
            manager = JpaFactory.getInstance().getEntityManager(UNIT);
            manager.persist(banco);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

       return true;
    }

    public Collection<Banco> listaDeBancos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    

}
