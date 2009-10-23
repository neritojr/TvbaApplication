/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.abstractfactory.jpa;

import application.tvba.org.abstractfactory.Dao;
import application.tvba.org.dao.interfaces.UsuarioDao;
import application.tvba.org.dao.jpa.JpaUsuarioDao;

/**
 *
 * @author neritobaldojunior
 *
 * Método que faz chamadas as classes responsáveis pelas manipulações de persistência
 *
 */
public class JpaDao implements Dao{

    public UsuarioDao getUsuarioDao(){
        return new JpaUsuarioDao();
    }

    public UsuarioDao getBancoDao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public UsuarioDao getIndicadorDao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public UsuarioDao getSubIndicadorDao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public UsuarioDao getDireitoAcessoDao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
