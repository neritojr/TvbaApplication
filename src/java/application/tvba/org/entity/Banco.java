
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
@Table(name = "tb_cad_db")
public class Banco implements Serializable {

    @Id
    @Column(nullable=false, name = "iddb")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idBanco;
    @Column(nullable=false, name = "nome")
    private String nome;
    @Column(nullable=false, name = "porta")
    private Integer porta;
    @Column(nullable=false, name = "usuario")
    private String usuario;
    @Column(nullable=false, name = "senha")
    private String senha;
    @Column(nullable=false, name = "ip")
    private String ip;

    public Banco(){
        
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
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
     * @return the porta
     */
    public Integer getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banco other = (Banco) obj;
        if (this.idBanco != other.idBanco && (this.idBanco == null || !this.idBanco.equals(other.idBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.idBanco != null ? this.idBanco.hashCode() : 0);
        return hash;
    }

    

}
