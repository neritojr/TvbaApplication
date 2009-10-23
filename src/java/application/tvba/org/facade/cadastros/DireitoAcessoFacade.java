/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.facade.cadastros;

import application.tvba.org.dao.generic.CadastroDao;
import application.tvba.org.entity.DireitoAcesso;
import application.tvba.org.singleton.DaoFactory;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author neritobaldojunior
 */
public class DireitoAcessoFacade {


    //** Lista todos os Bancos gravados no banco **/
    public List<DireitoAcesso> listarDireitoAcessos(){
        CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getDireitoAcessoDao();
        List lda = genericDao.listarTodos(DireitoAcesso.class);
        return lda;
    }

    public boolean adicionarBanco(DireitoAcesso direitoAcesso){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getDireitoAcessoDao();
            genericDao.abreTransacao();
            genericDao.gravar(direitoAcesso);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

    public boolean excluirUsuario(DireitoAcesso direitoAcesso){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getDireitoAcessoDao();
            genericDao.abreTransacao();
            genericDao.excluir(direitoAcesso);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }
    
    public boolean atualizarUsuario(DireitoAcesso direitoAcesso){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getDireitoAcessoDao();
            genericDao.abreTransacao();
            genericDao.atualizar(direitoAcesso);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

}
