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
@Table(name = "uf")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uf.findAll", query = "SELECT u FROM Uf u")
    , @NamedQuery(name = "Uf.findByIdUf", query = "SELECT u FROM Uf u WHERE u.idUf = :idUf")
    , @NamedQuery(name = "Uf.findByNome", query = "SELECT u FROM Uf u WHERE u.nome = :nome")})
public class Uf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_uf")
    private Integer idUf;
    @Column(name = "nome")
    private String nome;

    public Uf() {
    }

    public Uf(Integer idUf) {
        this.idUf = idUf;
    }

    public Integer getIdUf() {
        return idUf;
    }

    public void setIdUf(Integer idUf) {
        this.idUf = idUf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUf != null ? idUf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uf)) {
            return false;
        }
        Uf other = (Uf) object;
        if ((this.idUf == null && other.idUf != null) || (this.idUf != null && !this.idUf.equals(other.idUf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "votation.DTO.Uf[ idUf=" + idUf + " ]";
    }
    
}
