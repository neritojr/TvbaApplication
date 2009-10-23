/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.facade.cadastros;

import application.tvba.org.dao.generic.CadastroDao;
import application.tvba.org.entity.Banco;
import application.tvba.org.singleton.DaoFactory;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author neritobaldojunior
 */
public class BancoFacade {

    //** Lista Banco por seu código (chave primária) **/
    public Banco listarBancoPorCodigo(Banco banco,int cod){
        CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getBancoDao();
        return (Banco) genericDao.buscaPorCodigo(banco,cod);
    }

    //** Lista todos os Bancos gravados no banco **/
    public List<Banco> listarBancos(){
        CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getBancoDao();
        List lb = genericDao.listarTodos(Banco.class);
        return lb;
    }

    public boolean adicionarBanco(Banco banco){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getBancoDao();
            genericDao.abreTransacao();
            genericDao.gravar(banco);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

    public boolean excluirBanco(Banco banco){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getBancoDao();
            genericDao.abreTransacao();
            genericDao.excluir(banco);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }
    
    public boolean atualizarBanco(Banco banco){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getBancoDao();
            genericDao.abreTransacao();
            genericDao.atualizar(banco);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

}
