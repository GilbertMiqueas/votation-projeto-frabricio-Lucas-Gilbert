package votation.object;

public class ObjectUsuario {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Integer municipio) {
		this.municipio = municipio;
	}


	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Integer getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public Integer getSecaoEleitoral() {
		return secaoEleitoral;
	}

	public void setSecaoEleitoral(Integer secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	private String nome;
	private String data;
	private String dataEmissao;
	private Integer tipoUsuario;
	private Integer municipio;
	private String numeroTitulo;
	private Integer secaoEleitoral;
	private String senha;

}
