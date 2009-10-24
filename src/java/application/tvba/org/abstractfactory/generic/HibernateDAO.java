/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.abstractfactory.generic;

import application.tvba.org.abstractfactory.generic.DaoGeneric;
import application.tvba.org.dao.generic.GenericDao;

/**
 *
 * @author marialvo
 */
public class HibernateDAO implements DaoGeneric {

    public GenericDao getUsuarioDao(){
        return new GenericDao();
    }

    public GenericDao getBancoDao() {
        return new GenericDao();
    }

    public GenericDao getIndicadorDao() {
        return new GenericDao();
    }

    public GenericDao getSubIndicadorDao() {
        return new GenericDao();
    }

    public GenericDao getDireitoAcessoDao() {
        return new GenericDao();
    }

}
