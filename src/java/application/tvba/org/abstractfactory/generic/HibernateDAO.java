/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.abstractfactory.generic;

import application.tvba.org.abstractfactory.generic.DaoGeneric;
import application.tvba.org.dao.generic.CadastroDao;

/**
 *
 * @author marialvo
 */
public class HibernateDAO implements DaoGeneric {

    public CadastroDao getUsuarioDao(){
        return new CadastroDao();
    }

    public CadastroDao getBancoDao() {
        return new CadastroDao();
    }

    public CadastroDao getIndicadorDao() {
        return new CadastroDao();
    }

    public CadastroDao getSubIndicadorDao() {
        return new CadastroDao();
    }

    public CadastroDao getDireitoAcessoDao() {
        return new CadastroDao();
    }

}
