/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.generic;

import application.tvba.org.dao.ConexaoCliente;
import application.tvba.org.entity.Indicador;
import application.tvba.org.entity.Movimentacao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neritobaldojunior
 */
public class Acompanhar extends Thread{

    public Acompanhar(){

    }

    public Acompanhar(Indicador indicador){

    }

    public void run(){
        
    }



    //Compara os valores em banco com os valores
    //do Indicador (valorOtimizado, valorAceitavel, valorBaixo).
    //esta função será usada pela Thread [ Acompanhar ]
    public String consultarIndicadores(Indicador indicador){
        Float consulta = consultarScript(indicador);
        String mensagem="";
        if(consulta<=indicador.getValorBaixo()){
            mensagem="Atenção! Valor do indicador "+indicador.getNome()+" está muito baixo.\n" +
                    "Valor atual: "+consulta;
        }else if(consulta<=indicador.getValorBaixo()){
            mensagem="Valor do indicador "+indicador.getNome()+" é aceitável.\n" +
                    "Valor atual: "+consulta;
        }else{
            mensagem="Valor do indicador "+indicador.getNome()+" está alto!.\n" +
                    "Valor atual: "+consulta;
        }
        return mensagem;

    }

    //Faz consulta no banco do cliente
    public Float consultarScript(Indicador indicador){
        Connection con = ConexaoCliente.getConexao();
        Float resultadoConsulta=null;
        try {
            Statement statement = con.createStatement();
            //Executa o Script do Indicador
            ResultSet result = statement.executeQuery(indicador.getScript());

            while(result.next()){
                // CONFIGURAR PARÂMETRO CONFORME O SCRIPT   ******
                resultadoConsulta=result.getFloat(1);
            }

            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(IndicadorDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("IndicadorDao.consultarScript. \n"+ex.toString());
            ex.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(SQLException ex){
                ex.printStackTrace();
                Logger.getLogger(IndicadorDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("IndicadorDao.consultarScript. fechar conexão\n"+ex.toString());
            }

        }

        Calendar calendar = new GregorianCalendar();
        Date data = new Date();
        calendar.setTime(data);
        
        try{
            Movimentacao mov = new Movimentacao();
            //Atribui valores para gravar na tabela [ tb_movimentacao ]
            mov.setDataMovimentacao(calendar.getTime());
            mov.setIdIndicador(mov.getIdIndicador());
            mov.setStatus("T");
            mov.setValorRetorno(mov.getValorRetorno());

            MovimentacaoDao movDao = new MovimentacaoDao();
            movDao.gravarMovimentacao(mov);

        }catch(Exception e){
            e.printStackTrace();
        }
      
        return resultadoConsulta;
    }


}
