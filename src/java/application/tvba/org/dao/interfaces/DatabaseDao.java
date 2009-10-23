/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.interfaces;

import application.tvba.org.entity.Banco;
import java.util.Collection;

/**
 *
 * @author neritobaldojunior
 *
 * Interface responsável por determinar o que deverá ser implementado nas transações do objeto Database.
 *
 */
public interface DatabaseDao {

    public boolean gravarDatabaseDao(Banco banco );

    public Collection<Banco> listaDeBancos();

}
