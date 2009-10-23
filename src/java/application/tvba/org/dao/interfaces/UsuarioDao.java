/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.dao.interfaces;

import application.tvba.org.entity.Usuario;
import java.util.Collection;

/**
 *
 * @author neritobaldojunior
 */
public interface UsuarioDao {

    public void inserir(Usuario usuario);

    public void excluir(Usuario usuario);

    public void atualizar(Usuario usuario);

    public Collection<Usuario> listarUsuarios();

    public Usuario buscaUsuarioPorCodigo(Usuario usuario);

    public Usuario buscaUsuarioPorChave(Usuario usuario);

}
