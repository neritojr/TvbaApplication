

package application.tvba.org.abstractfactory.generic;

import application.tvba.org.dao.generic.CadastroDao;

/**
 *
 * @author neritobaldojunior
 */
public interface DaoGeneric {

    public CadastroDao getUsuarioDao();
    public CadastroDao getBancoDao();
    public CadastroDao getIndicadorDao();
    public CadastroDao getSubIndicadorDao();
    public CadastroDao getDireitoAcessoDao();
    

}
