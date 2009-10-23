/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.generic;

import org.hibernate.Session;

/**
 *
 * @author neritobaldojunior
 */
public class ConsultasDao {

    private Session session = null;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }


//> Instanciar Indicador
//> Carregar todos seus atributos
//> Realizar consultas no banco do cliente a partir do atributo [ script ] .
//> Validar o retorno das consultas no banco do cliente usando os atributos 
//> [ valorOtimizado ],  [ valorAceitavel ] e  [ valorBaixo ]

}
