package application.tvba.org.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author neritobaldojunior
 */
@Entity
@Table(name = "tb_cad_usuario")
public class Usuario implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @Column(nullable=false, name="idUsuario")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column(nullable=false, name="nome")
    private String nome;
    @Column(nullable=false, name="chaveacesso")
    private String chaveAcesso;

    public Usuario(){
        
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the chaveAcesso
     */
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * @param chaveAcesso the chaveAcesso to set
     */
    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.idUsuario != other.idUsuario && (this.idUsuario == null || !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.idUsuario != null ? this.idUsuario.hashCode() : 0);
        return hash;
    }



}
