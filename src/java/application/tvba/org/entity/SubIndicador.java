
package application.tvba.org.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author neritobaldojunior
 */
@Entity
@Table(name="tb_cad_subindicador")
public class SubIndicador implements Serializable  {

    private static long serialVersionUID = 1L;

    @Id
    @Column(nullable=false, name="idSubIndicador")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idSubIndicador;
    @Column(nullable=false, name="idIndicador")
    private Integer idIndicador;
    @Column(nullable=false, name="nome")
    private String nome;
    @Column(name="valorOtimizado")
    private Double valorOtimizado;
    @Column(name="valorAceitavel")
    private Double valorAceitavel;
    @Column(name="valorBaixo")
    private Double valorBaixo;
    @Column(name="idUsuarioAlteracao")
    private Integer idUsuarioAlteracao;
    @Column(nullable=false, name="dataAlteracao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAlteracao;

    public SubIndicador(){
        
    }

    public Integer getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(Integer idIndicador) {
        this.idIndicador = idIndicador;
    }
    

    /**
     * @return the idSubIndicador
     */
    public Integer getIdSubIndicador() {
        return idSubIndicador;
    }

    /**
     * @param idSubIndicador the idSubIndicador to set
     */
    public void setIdSubIndicador(Integer idSubIndicador) {
        this.idSubIndicador = idSubIndicador;
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
     * @return the valorOtimizado
     */
    public Double getValorOtimizado() {
        return valorOtimizado;
    }

    /**
     * @param valorOtimizado the valorOtimizado to set
     */
    public void setValorOtimizado(Double valorOtimizado) {
        this.valorOtimizado = valorOtimizado;
    }

    /**
     * @return the valorAceitavel
     */
    public Double getValorAceitavel() {
        return valorAceitavel;
    }

    /**
     * @param valorAceitavel the valorAceitavel to set
     */
    public void setValorAceitavel(Double valorAceitavel) {
        this.valorAceitavel = valorAceitavel;
    }

    /**
     * @return the valorBaixo
     */
    public Double getValorBaixo() {
        return valorBaixo;
    }

    /**
     * @param valorBaixo the valorBaixo to set
     */
    public void setValorBaixo(Double valorBaixo) {
        this.valorBaixo = valorBaixo;
    }

    /**
     * @return the idUsuarioAlteracao
     */
    public Integer getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    /**
     * @param idUsuarioAlteracao the idUsuarioAlteracao to set
     */
    public void setIdUsuarioAlteracao(Integer idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }

    /**
     * @return the dataAlteracao
     */
    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * @param dataAlteracao the dataAlteracao to set
     */
    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SubIndicador other = (SubIndicador) obj;
        if (this.getIdSubIndicador() != other.getIdSubIndicador() && (this.getIdSubIndicador() == null || !this.idSubIndicador.equals(other.idSubIndicador))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.getIdSubIndicador() != null ? this.getIdSubIndicador().hashCode() : 0);
        return hash;
    }


}
