/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.facade.cadastros;

import application.tvba.org.dao.generic.CadastroDao;
import application.tvba.org.entity.Indicador;
import application.tvba.org.entity.SubIndicador;
import application.tvba.org.singleton.DaoFactory;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author neritobaldojunior
 *
 * Classe responsável por intermediar as requisições.
 *
 */
public class SubIndicatorFacade {


    //** Lista Indicador por seu código (chave primária) **/
    public Indicador listaSubIndicadorPorCodigo(SubIndicador subIndicador,int cod){
        CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getSubIndicadorDao();
        return (Indicador) genericDao.buscaPorCodigo(subIndicador,cod);
    }

    //** Lista todos os Indicador gravados no banco **/
    public List<SubIndicador> listarSubIndicador(){
        CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getSubIndicadorDao();
        List lu = genericDao.listarTodos(SubIndicador.class);
        return lu;
    }

    public boolean adicionarSubIndicador(SubIndicador subIndicador){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getSubIndicadorDao();
            genericDao.abreTransacao();
            genericDao.gravar(subIndicador);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

    public boolean excluirSubIndicador(SubIndicador subIndicador){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getSubIndicadorDao();
            genericDao.abreTransacao();
            genericDao.excluir(subIndicador);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

    public boolean atualizarSubIndicador(SubIndicador subIndicador){
        Boolean resultado = false;
        try {
            CadastroDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getSubIndicadorDao();
            genericDao.abreTransacao();
            genericDao.atualizar(subIndicador);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

}
