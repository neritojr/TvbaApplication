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
@Table(name="tb_cad_indicador")
public class Indicador implements Serializable {
    
    private static long serialVersionUID = 1L;

    @Id
    @Column(nullable=false,name="idIndicator")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idIndicator;
    @Column(nullable=false,name="nome")
    private String nome;
    @Column(name="script")
    private String script;
    @Column(name="valorOtimizado")
    private Double valorOtimizado;
    @Column(name="valorAceitavel")
    private Double valorAceitavel;
    @Column(name="valorBaixo")
    private Double valorBaixo;
    @Column(name="idUsuarioAlteracao")
    private Integer idUsuarioAlteracao;
    @Column(nullable=false,name="dataAlteracao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAlteracao;

    public Indicador(){
        
    }

    /**
     * @return the idIndicator
     */
    public Integer getIdIndicator() {
        return idIndicator;
    }

    /**
     * @param idIndicator the idIndicator to set
     */
    public void setIdIndicator(Integer idIndicator) {
        this.idIndicator = idIndicator;
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
     * @return the script
     */
    public String getScript() {
        return script;
    }

    /**
     * @param script the script to set
     */
    public void setScript(String script) {
        this.script = script;
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
        final Indicador other = (Indicador) obj;
        if (this.getIdIndicator() != other.getIdIndicator() && (this.getIdIndicator() == null || !this.idIndicator.equals(other.idIndicator))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.getIdIndicator() != null ? this.getIdIndicator().hashCode() : 0);
        return hash;
    }


    

}
