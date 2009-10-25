package application.tvba.org.entity;

import application.tvba.org.dao.generic.GenericDao;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author neritobaldojunior
 */
@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao implements Serializable {

    @Id
    @Column(nullable=false, name="idindicador")
    private Integer idIndicador;
    @Column(nullable=false,name="valorretorno")
    private Float valorRetorno;
    @Column(nullable=false, name="datamovimentacao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataMovimentacao;
    @Column(name="status")
    private String status;

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Integer getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(Integer idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getValorRetorno() {
        return valorRetorno;
    }

    public void setValorRetorno(Float valorRetorno) {
        this.valorRetorno = valorRetorno;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movimentacao other = (Movimentacao) obj;
        if (this.idIndicador != other.idIndicador && (this.idIndicador == null || !this.idIndicador.equals(other.idIndicador))) {
            return false;
        }
        if (this.dataMovimentacao != other.dataMovimentacao && (this.dataMovimentacao == null || !this.dataMovimentacao.equals(other.dataMovimentacao))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.idIndicador != null ? this.idIndicador.hashCode() : 0);
        hash = 23 * hash + (this.dataMovimentacao != null ? this.dataMovimentacao.hashCode() : 0);
        return hash;
    }




}
