/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.generic;

import application.tvba.org.entity.Indicador;
import application.tvba.org.singleton.DaoFactory;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author neritobaldojunior
 */
public class IndicadorDao {

    private Session session = null;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }


    public List listarIndicadores(){
        GenericDao genericDao = DaoFactory.getInstance().getDaoGeneric(DaoFactory.TIPO_HIBERNATE).getIndicadorDao();
        List listaIndicadores = genericDao.listarTodos(Indicador.class);
        return listaIndicadores;

    }

    public void acompanharIndicadores(){
        
        List listaIndicadores = listarIndicadores();

        for(int it=0;it < listaIndicadores.size();it++){
            Acompanhar acompanharIndicador = new Acompanhar((Indicador)listaIndicadores.get(it));
            acompanharIndicador.start();
        }

    }

    //Compara os valores em banco com os valores
    //do Indicador (valorOtimizado, valorAceitavel, valorBaixo).
    //esta função será usada pela Thread [ Acompanhar ]
    public void consultarIndicadores(Indicador indicador){

        

    }

    //Faz consulta no banco do cliente
    public void consultarScript(Indicador indicador){


    }

// O sistema deve mostrar os indicadores disponíveis (gravados em banco)
// para que estes sejam usados nas consultas.

// Criar


//> Instanciar Indicador
//> Carregar todos seus atributos
//> Realizar consultas no banco do cliente a partir do atributo [ script ] .
//> Validar o retorno das consultas no banco do cliente usando os atributos 
//> [ valorOtimizado ],  [ valorAceitavel ] e  [ valorBaixo ]

}
