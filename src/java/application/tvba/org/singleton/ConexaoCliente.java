/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author neritobaldojunior
 */
public class ConexaoCliente {

    /** mÈtodo utilizando pool de conexıes gerenciado pelo Tomcat */
    public static java.sql.Connection getConexao(){
        Connection con = null;
        try {
            InitialContext ctx = new InitialContext();
            DataSource db = (DataSource)ctx.lookup("java:comp/env/jdbc/bancoCliente");
            con = db.getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
     }

}
