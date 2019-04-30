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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome")
    , @NamedQuery(name = "Usuario.findByDataNascimento", query = "SELECT u FROM Usuario u WHERE u.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Usuario.findByMunicipio", query = "SELECT u FROM Usuario u WHERE u.municipio = :municipio")
    , @NamedQuery(name = "Usuario.findByUf", query = "SELECT u FROM Usuario u WHERE u.uf = :uf")
    , @NamedQuery(name = "Usuario.findByNumeroTitulo", query = "SELECT u FROM Usuario u WHERE u.numeroTitulo = :numeroTitulo")
    , @NamedQuery(name = "Usuario.findByDataEmissao", query = "SELECT u FROM Usuario u WHERE u.dataEmissao = :dataEmissao")
    , @NamedQuery(name = "Usuario.findByZona", query = "SELECT u FROM Usuario u WHERE u.zona = :zona")
    , @NamedQuery(name = "Usuario.findBySecaoEleitoral", query = "SELECT u FROM Usuario u WHERE u.secaoEleitoral = :secaoEleitoral")
    , @NamedQuery(name = "Usuario.findByTipoUsuario", query = "SELECT u FROM Usuario u WHERE u.tipoUsuario = :tipoUsuario")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "municipio")
    private Integer municipio;
    @Column(name = "uf")
    private Integer uf;
    @Column(name = "numero_titulo")
    private String numeroTitulo;
    @Column(name = "data_emissao")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "zona")
    private Integer zona;
    @Column(name = "secao_eleitoral")
    private Integer secaoEleitoral;
    @Column(name = "tipo_usuario")
    private Integer tipoUsuario;
	@Column(name = "senha")
    private String senha;
    
    public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public Integer getUf() {
        return uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public String getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(String numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Integer getSecaoEleitoral() {
        return secaoEleitoral;
    }

    public void setSecaoEleitoral(Integer secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "votation.DTO.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
