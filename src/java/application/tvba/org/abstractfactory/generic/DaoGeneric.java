

package application.tvba.org.abstractfactory.generic;

import application.tvba.org.dao.generic.GenericDao;

/**
 *
 * @author neritobaldojunior
 */
public interface DaoGeneric {

    public GenericDao getUsuarioDao();
    public GenericDao getBancoDao();
    public GenericDao getIndicadorDao();
    public GenericDao getSubIndicadorDao();
    public GenericDao getDireitoAcessoDao();
    

}
