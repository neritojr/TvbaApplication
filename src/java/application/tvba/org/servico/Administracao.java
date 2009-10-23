/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.servico;

import application.tvba.org.entity.Banco;
import application.tvba.org.entity.Usuario;
import application.tvba.org.facade.cadastros.BancoFacade;
import application.tvba.org.facade.cadastros.UsuarioFacade;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author neritobaldojunior
 */
@WebService()
public class Administracao {

    /**
     * Adiciona Usuario no banco
     */
    @WebMethod(operationName = "adicionarUsuario")
    public boolean adicionarUsuario(@WebParam(name = "usuario")
    Usuario usuario) {
        return new UsuarioFacade().adicionarUsuario(usuario);
    }

    /**
     * Exclui usuario do banco
     */
    @WebMethod(operationName = "excluirUsuario")
    public boolean excluirUsuario(@WebParam(name = "usuario")
    Usuario usuario) {
        return new UsuarioFacade().excluirUsuario(usuario);
    }

    /**
     * Atualiza Usuario
     */
    @WebMethod(operationName = "operação")
    public boolean atualizarUsuario(@WebParam(name = "usuario")
    Usuario usuario) {
        return new UsuarioFacade().atualizarUsuario(usuario);
    }

    /**
     * Retorna o usuario conferindo seu código;
     * o Método poderá receber um Usuario somente com o seu código
     * e retornará o Usuario com todos os atributos, se existir em banco.
     */
    @WebMethod(operationName = "listarUsuarioPorCodigo")
    public Usuario listarUsuarioPorCodigo(@WebParam(name = "usuario")
    Usuario usuario) {
        return new UsuarioFacade().listaUsuarioPorCodigo(usuario, usuario.getIdUsuario());
    }

    /**
     * Retorna uma lista com todos os usuarios gravados.
     */
    @WebMethod(operationName = "listarUsuarios")
    public List listarUsuarios() {
        return new UsuarioFacade().listarUsuarios();
    }

/// > Objeto Banco ====================================

     /**
     * Adiciona Usuario no banco
     */
    @WebMethod(operationName = "adicionarBanco")
    public boolean adicionarBanco(@WebParam(name = "banco")
    Banco banco) {
        return new BancoFacade().adicionarBanco(banco);
    }

    /**
     * Exclui usuario do banco
     */
    @WebMethod(operationName = "excluirBanco")
    public boolean excluirBanco(@WebParam(name = "banco")
    Banco banco) {
        return new BancoFacade().excluirBanco(banco);
    }

    /**
     * Atualiza Banco
     */
    @WebMethod(operationName = "atualizarBanco")
    public boolean atualizarBanco(@WebParam(name = "banco")
    Banco banco) {
        return new BancoFacade().atualizarBanco(banco);
    }

    /**
     * Retorna o banco conferindo seu código;
     * o Método poderá receber um Banco somente com o seu código
     * e retornará o Banco com todos os atributos, se existir em banco.
     */
    @WebMethod(operationName = "listarBancoPorCodigo")
    public Banco listarBancoPorCodigo(@WebParam(name = "banco")
    Banco banco) {
        return new BancoFacade().listarBancoPorCodigo(banco, banco.getIddb());
    }

    /**
     * Retorna uma lista com todos os usuarios gravados.
     */
    @WebMethod(operationName = "listarBancos")
    public List listarBancos() {
        return new BancoFacade().listarBancos();
    }



    


}
