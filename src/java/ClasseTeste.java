
import application.tvba.org.entity.Usuario;
import application.tvba.org.servico.Administracao;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marialvo
 */
public class ClasseTeste {

    public static void main(String args []){

        System.out.println("Inicio dos Testes");

        Administracao admn = new Administracao();
        Usuario usu= new Usuario();
        
        usu.setChaveAcesso("019834jqwhjq3");
        usu.setNome("Ronaldo");
     //   usu.setIdusuario(4);

        if (admn.adicionarUsuario(usu)){
            System.out.println("Funciona !!!");
        }

        Date date = new Date();
       
      /*

        Usuario usu = new Usuario();
        usu.setChaveAcesso("chava");
        usu.setNome("Gerúndion");

        UsuarioFacade usuFac = new UsuarioFacade();
        if (usuFac.adicionarUsuario(usu)){
            System.out.println("Fociona.!!! =D");
        }
        */

        
        
        //GenericDAO genDao = new GenericDAO();
        //u = (Usuario) genDao.buscaPorCodigo(u, 3);
        //System.out.print(u.getNome());
        //u.setNome("Marialvo 4");
        //u.setChaveAcesso("123456");
        //JpaUsuarioDao jud = new JpaUsuarioDao();
        //jud.salvar(u);
        //genDao.abreTransacao();
        //genDao.gravar(u);
        //genDao.commit();

        /*List l = genDao.listarTodos(Usuario.class);
        Iterator it = l.iterator();
        while (it.hasNext()){
            u = (Usuario) it.next();
            System.out.println(u.getNome() +" - " +u.getIdusuario());
        }*/


        
    }

}
