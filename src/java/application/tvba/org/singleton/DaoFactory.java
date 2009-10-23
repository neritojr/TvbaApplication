package application.tvba.org.singleton;

import application.tvba.org.abstractfactory.Dao;
import application.tvba.org.abstractfactory.generic.DaoGeneric;
import application.tvba.org.abstractfactory.generic.HibernateDAO;
import application.tvba.org.abstractfactory.jpa.JpaDao;

/**
 *
 * @author neritobaldojunior
 */
public class DaoFactory {

    private static DaoFactory factory;
    public static final String TIPO_JPA = "TIPO_JPA";
    public static final String TIPO_ORACLE = "TIPO_ORACLE";
    public static final String TIPO_HIBERNATE = "TIPO_HIBERNATE";

    private DaoFactory(){

    }

    public static DaoFactory getInstance(){
            if(factory == null){
                    factory = new DaoFactory();
            }

            return factory;
    }


    public Dao getDao(String nomeDao) {

        Dao retorno = null;

        if (TIPO_JPA.equals(nomeDao)) {
            retorno = new JpaDao();
        }
        return retorno;
    }

    public DaoGeneric getDaoGeneric(String nomeDao) {

        DaoGeneric retorno = null;

        if (TIPO_HIBERNATE.equals(nomeDao)) {
            retorno = new HibernateDAO();
        }
        return retorno;
    }



}
