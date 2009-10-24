/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application.tvba.org.dao.generic;

import application.tvba.org.singleton.HibernateFactory;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marialvo
 */
public class GenericDao {

    private Session session = null;
    
    private Session getSession() {
        return session;
    }

    private void setSession(Session session) {
        this.session = session;
    }

    public void gravar(Object objeto) throws HibernateException {
        this.getSession().save(objeto);
    }

    public void excluir(Object objeto) throws HibernateException {
        this.getSession().delete(objeto);
    }

    public void pegarIndicadoresAtivos(){
        

    }

    public void atualizar(Object objeto) throws HibernateException {
        this.getSession().update(objeto);
    }

    public List<Object> listarTodos(Class objeto) throws HibernateException {
        List objts = null;
        Criteria selectAll = this.getSession().createCriteria(objeto);
        objts = selectAll.list();
        return objts;
    }

    public Object buscaPorCodigo(Object object,int cod) throws HibernateException {
        //Monta nome do campo chave a ser filtrado
        String nomeCampo = "id"+object.getClass().getSimpleName();

        //efetua Busca Unica no banco pelo idObject
        object = this.getSession().createCriteria(object.getClass())
            .add(Restrictions.eq("idusuario", cod))
            .uniqueResult();

        // Retorna resultado da busca
        return object;
    }

    public void abreTransacao() throws HibernateException {
        this.getSession().beginTransaction();
    }

    public void commit() throws HibernateException {
        this.getSession().getTransaction().commit();
    }

    public void rollback() throws HibernateException {
        this.getSession().getTransaction().rollback();
    }

    public GenericDao() {
        HibernateFactory hf = HibernateFactory.getInstance();
        this.setSession(hf.getSession());
    }
}
