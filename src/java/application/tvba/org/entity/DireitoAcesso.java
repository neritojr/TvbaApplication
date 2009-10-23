/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
@Table(name="tb_acesso")
public class DireitoAcesso implements Serializable  {
    @Id
    @Column(nullable=false, name="idAcesso")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idAcesso;
    @Column(nullable=false, name="idUsuario")
    private Integer idUsuario;
    @Column(nullable=false, name="idIndicador")
    private Integer idIndicador;

    public DireitoAcesso(){
        
    }

    /**
     * @return the idAcesso
     */
    public Integer getIdAcesso() {
        return idAcesso;
    }

    /**
     * @param idAcesso the idAcesso to set
     */
    public void setIdAcesso(Integer idAcesso) {
        this.idAcesso = idAcesso;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idIndicador
     */
    public Integer getIdIndicador() {
        return idIndicador;
    }

    /**
     * @param idIndicador the idIndicador to set
     */
    public void setIdIndicador(Integer idIndicador) {
        this.idIndicador = idIndicador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DireitoAcesso other = (DireitoAcesso) obj;
        if (this.idAcesso != other.idAcesso && (this.idAcesso == null || !this.idAcesso.equals(other.idAcesso))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.idAcesso != null ? this.idAcesso.hashCode() : 0);
        return hash;
    }

    

}
