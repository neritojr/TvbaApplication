

package application.tvba.org.abstractfactory;

import application.tvba.org.dao.interfaces.UsuarioDao;

/**
 *
 * @author neritobaldojunior
 */
public interface Dao {

    public UsuarioDao getUsuarioDao();
    public UsuarioDao getBancoDao();
    public UsuarioDao getIndicadorDao();
    public UsuarioDao getSubIndicadorDao();
    public UsuarioDao getDireitoAcessoDao();
    

}
