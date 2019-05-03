/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package votation.DTO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Gilbert Cantaleano
 */
@Entity
@Table(name = "log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Log.findAll", query = "SELECT l FROM Log l")
    , @NamedQuery(name = "Log.findByIdLog", query = "SELECT l FROM Log l WHERE l.idLog = :idLog")
    , @NamedQuery(name = "Log.findByLog", query = "SELECT l FROM Log l WHERE l.log = :log")
    , @NamedQuery(name = "Log.findByPagina", query = "SELECT l FROM Log l WHERE l.pagina = :pagina")
    , @NamedQuery(name = "Log.findByData", query = "SELECT l FROM Log l WHERE l.data = :data")})
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log")
    private Integer idLog;
    @Column(name = "log")
    private String log;
    @Column(name = "pagina")
    private String pagina;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @JoinColumn(name = "usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuario;

    public Log() {
    }

    public Log(Integer idLog) {
        this.idLog = idLog;
    }

    public Integer getIdLog() {
        return idLog;
    }

    public void setIdLog(Integer idLog) {
        this.idLog = idLog;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLog != null ? idLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Log)) {
            return false;
        }
        Log other = (Log) object;
        if ((this.idLog == null && other.idLog != null) || (this.idLog != null && !this.idLog.equals(other.idLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "votation.DTO.Log[ idLog=" + idLog + " ]";
    }

}
