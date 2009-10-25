/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.generic;

import application.tvba.org.entity.Movimentacao;
import org.hibernate.HibernateException;

/**
 *
 * @author neritobaldojunior
 */
public class MovimentacaoDao {

    public void gravarMovimentacao(Movimentacao mov){
        GenericDao genDao = new GenericDao();
        //Grava movimentação
        try{
            genDao.gravar(mov);
        }catch(HibernateException ex){
            ex.printStackTrace();
            System.out.println("Erro: MovimentacaoDao.gravarmovimentacao \n"+ex.toString());
        }
    }


}
