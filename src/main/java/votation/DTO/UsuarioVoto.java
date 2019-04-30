/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votation.DTO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "usuario_voto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioVoto.findAll", query = "SELECT u FROM UsuarioVoto u")
    , @NamedQuery(name = "UsuarioVoto.findByIdUsuarioVoto", query = "SELECT u FROM UsuarioVoto u WHERE u.idUsuarioVoto = :idUsuarioVoto")
    , @NamedQuery(name = "UsuarioVoto.findByUsuario", query = "SELECT u FROM UsuarioVoto u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "UsuarioVoto.findByNumeroCanditado", query = "SELECT u FROM UsuarioVoto u WHERE u.numeroCanditado = :numeroCanditado")})
public class UsuarioVoto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_voto")
    private Integer idUsuarioVoto;
    @Column(name = "usuario")
    private Integer usuario;
    @Column(name = "numero_canditado")
    private Integer numeroCanditado;

    public UsuarioVoto() {
    }

    public UsuarioVoto(Integer idUsuarioVoto) {
        this.idUsuarioVoto = idUsuarioVoto;
    }

    public Integer getIdUsuarioVoto() {
        return idUsuarioVoto;
    }

    public void setIdUsuarioVoto(Integer idUsuarioVoto) {
        this.idUsuarioVoto = idUsuarioVoto;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getNumeroCanditado() {
        return numeroCanditado;
    }

    public void setNumeroCanditado(Integer numeroCanditado) {
        this.numeroCanditado = numeroCanditado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioVoto != null ? idUsuarioVoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioVoto)) {
            return false;
        }
        UsuarioVoto other = (UsuarioVoto) object;
        if ((this.idUsuarioVoto == null && other.idUsuarioVoto != null) || (this.idUsuarioVoto != null && !this.idUsuarioVoto.equals(other.idUsuarioVoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "votation.DTO.UsuarioVoto[ idUsuarioVoto=" + idUsuarioVoto + " ]";
    }
    
}
