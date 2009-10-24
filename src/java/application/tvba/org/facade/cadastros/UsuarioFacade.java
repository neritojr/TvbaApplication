/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.facade.cadastros;

import application.tvba.org.dao.generic.GenericDao;
import application.tvba.org.entity.Usuario;
import application.tvba.org.singleton.DaoFactory;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author neritobaldojunior
 */
public class UsuarioFacade {

    //** Lista usuário por seu código (chave primária) **/
    public Usuario listaUsuarioPorCodigo(Usuario usuario,int cod){
        GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getUsuarioDao();
        return (Usuario) genericDao.buscaPorCodigo(usuario,cod);
    }

    //** Lista todos os usuários gravados no banco **/
    public List<Usuario> listarUsuarios(){
        GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getUsuarioDao();
        List lu = genericDao.listarTodos(Usuario.class);
        return lu;
    }

    public boolean adicionarUsuario(Usuario usuario){
        Boolean resultado = false;
        try {
            GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getUsuarioDao();
            genericDao.abreTransacao();
            genericDao.gravar(usuario);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            he.printStackTrace();
            System.out.println(he);
        }
        return resultado;
    }

    public boolean excluirUsuario(Usuario usuario){
        Boolean resultado = false;
        try {
            GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getUsuarioDao();
            genericDao.abreTransacao();
            genericDao.excluir(usuario);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            he.printStackTrace();
            System.out.println(he);
        }
        return resultado;
    }
    
    public boolean atualizarUsuario(Usuario usuario){
        Boolean resultado = false;
        try {
            GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getUsuarioDao();
            genericDao.abreTransacao();
            genericDao.atualizar(usuario);
            genericDao.commit();
            resultado = true;
        } catch (HibernateException he){
            he.printStackTrace();
            System.out.println(he);
        }
        return resultado;
    }

}
