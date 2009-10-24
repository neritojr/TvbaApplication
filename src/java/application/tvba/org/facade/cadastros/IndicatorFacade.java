/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.facade.cadastros;

import application.tvba.org.dao.generic.GenericDao;
import application.tvba.org.entity.Indicador;
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
public class IndicatorFacade {


    //** Lista Indicador por seu código (chave primária) **/
    public Indicador listaIndicadorPorCodigo(Indicador indicador,int cod){
        GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getIndicadorDao();
        return (Indicador) genericDao.buscaPorCodigo(indicador,cod);
    }

    //** Lista todos os Indicador gravados no banco **/
    public List<Indicador> listarIndicador(){
        GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getIndicadorDao();
        List lu = genericDao.listarTodos(Indicador.class);
        return lu;
    }

    public boolean adicionarIndicador(Indicador indicador){
        Boolean resultado = false;
        try {
            GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getIndicadorDao();
            genericDao.abreTransacao();
            genericDao.gravar(indicador);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

    public boolean excluirIndicador(Indicador indicador){
        Boolean resultado = false;
        try {
            GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getIndicadorDao();
            genericDao.abreTransacao();
            genericDao.excluir(indicador);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

    public boolean atualizarIndicador(Indicador indicador){
        Boolean resultado = false;
        try {
            GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getIndicadorDao();
            genericDao.abreTransacao();
            genericDao.atualizar(indicador);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            System.out.println(he);
        }
        return resultado;
    }

}
