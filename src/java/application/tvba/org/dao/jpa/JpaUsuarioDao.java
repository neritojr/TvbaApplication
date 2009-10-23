/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.jpa;

import application.tvba.org.dao.interfaces.UsuarioDao;
import application.tvba.org.entity.Usuario;
import application.tvba.org.singleton.JpaFactory;
import java.util.Collection;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author neritobaldojunior
 */
public class JpaUsuarioDao implements UsuarioDao{

    public static final String UNIT = "TvbaPersistence";

    public void salvar(Object obj){
        EntityManager manager = null;
        EntityTransaction tr = null;
        try{
            // Obtem um "engine" para utilização do JPA
            manager = JpaFactory.getInstance().getEntityManager(UNIT);
            // cria uma transação
            tr = manager.getTransaction();
            tr.begin();
            // Faz atualização do registro (persist -> insert())
            manager.persist(obj);
            tr.commit();
        }catch(Exception e){
            e.printStackTrace();
            tr.rollback();
        }finally{
            manager.close();
        }
    }

    public void inserir(Usuario usuario) {
        EntityManager mng = null;
        EntityTransaction tr = null;

        try{
            // Obtem um "engine" para utilização do JPA
            mng = JpaFactory.getInstance().getEntityManager(UNIT);
            // cria uma transação
            tr = mng.getTransaction();
            tr.begin();
            // Faz atualização do registro (persist -> insert())
            mng.persist(usuario);
            tr.commit();
        }catch(Exception e){
            e.printStackTrace();
            tr.rollback();
        }finally{
            mng.close();
        }
        
    }

    public void excluir(Usuario usuario) {
        EntityManager manager = null;
        EntityTransaction tr = null;
        try{
            // Obtem um "engine" para utilização do JPA
            manager = JpaFactory.getInstance().getEntityManager(UNIT);
            // cria uma transação
            tr = manager.getTransaction();
            tr.begin();

            Usuario pesquisado = this.buscaUsuarioPorCodigo(usuario);
            // Faz atualização do registro (persist -> insert())
            manager.remove(pesquisado);
            tr.commit();
        }catch(Exception e){
            e.printStackTrace();
            tr.rollback();
        }finally{
            manager.close();
        }
    }

    public void atualizar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Collection<Usuario> listarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Usuario buscaUsuarioPorCodigo(Usuario usuario) {
        EntityManager manager = null;
        Usuario retorno = null;
        try{
            // Obtem um "engine" para utilização do JPA
            manager = JpaFactory.getInstance().getEntityManager(UNIT);
            String query = "Select u From Usuario u Where idUsuario = ?1";
            
            Query consulta = manager.createQuery(query);
            // Definição do parametro configurado na consulta
            consulta.setParameter("1", usuario.getIdUsuario());

            retorno = (Usuario)consulta.getSingleResult();

            String ret = retorno.getIdUsuario().toString();
            if(!usuario.getIdUsuario().equals(Integer.parseInt(ret.trim()))){
                    retorno = null;
            }

        }catch (Exception e) {
            // Lança exceção
            e.printStackTrace();
        }finally{
            // Fecha JPA
            manager.close();
        }
        // Retorna resultado da busca
        return retorno;


    }

    public Usuario buscaUsuarioPorChave(Usuario usuario) {
                EntityManager manager = null;
        Usuario retorno = null;
        try{
            // Obtem um "engine" para utilização do JPA
            manager = JpaFactory.getInstance().getEntityManager(UNIT);
            String query = "Select u From Usuario u Where chaveacesso = ?1";

            Query consulta = manager.createQuery(query);
            // Definição do parametro configurado na consulta
            consulta.setParameter("1", usuario.getChaveAcesso());

            retorno = (Usuario)consulta.getSingleResult();

            String ret = retorno.getChaveAcesso().toString();
            if(!usuario.getChaveAcesso().trim().equals(ret.trim())){
                    retorno = null;
            }

        }catch (Exception e) {
            // Lança exceção
            e.printStackTrace();
        }finally{
            // Fecha JPA
            manager.close();
        }
        // Retorna resultado da busca
        return retorno;
        
    }


}
