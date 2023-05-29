package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Incidente {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "Nome_Vitima")
	private String nomeDaVitima;
	@Column(name = "Sexo_Vitima")
	private String sexoDaVitima;
	@Column(name = "Idade_Vitima")
	private Integer idadeDaVitima;
	@Column(name = "SerieTurno_Vitima")
	private String serieTurnoDaVitima;
	@Column(name = "Endereco_Vitima")
	private String enderecoDaVitima;
	
	@Column(name = "Nome_Agressor")
	private String nomeDoAgressor;
	@Column(name = "Sexo_Agressor")
	private String sexoDoAgressor;
	@Column(name = "Idade_Agressor")
	private Integer idadeDoAgressor;
	@Column(name = "Parentesco_Agressor")
	private String grauParentescoDoAgressor;
	@Column(name = "Ocupacao_Agressor")
	private String ocupacaoDoAgressor;
	@Column(name = "Raca_Agressor")
	private String racaCorDoAgressor;
	@Column(name = "Genero_Agressor")
	private String identidadeGeneroDoAgressor;
	@Column(name = "OrientacaoSexual_Agressor")
	private String orientacaoSexualDoAgressor;
	@Column(name = "Escolaridade_Agressor")
	private Integer escolaridadeDoAgressor;
	
	@Column(name = "Relato_Incidente")
	private String relatoDoIncidente;
	@Column(name = "ViolacaoDireito_Incidente")
	private String violacaoDeDireito;
	@Column(name = "Providencias_Incidente")
	private String providencias;
	@Column(name = "DataRegistro_Incidente")
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@PrePersist
    protected void onCreate() {
        data = new Date();
    }

	public String getNomeDaVitima() {
		return nomeDaVitima;
	}

	public void setNomeDaVitima(String nomeDaVitima) {
		this.nomeDaVitima = nomeDaVitima;
	}

	public String getSexoDaVitima() {
		return sexoDaVitima;
	}

	public void setSexoDaVitima(String sexoDaVitima) {
		this.sexoDaVitima = sexoDaVitima;
	}

	public Integer getIdadeDaVitima() {
		return idadeDaVitima;
	}

	public void setIdadeDaVitima(Integer idadeDaVitima) {
		this.idadeDaVitima = idadeDaVitima;
	}

	public String getSerieTurnoDaVitima() {
		return serieTurnoDaVitima;
	}

	public void setSerieTurnoDaVitima(String serieTurnoDaVitima) {
		this.serieTurnoDaVitima = serieTurnoDaVitima;
	}

	public String getEnderecoDaVitima() {
		return enderecoDaVitima;
	}

	public void setEnderecoDaVitima(String enderecoDaVitima) {
		this.enderecoDaVitima = enderecoDaVitima;
	}

	public String getNomeDoAgressor() {
		return nomeDoAgressor;
	}

	public void setNomeDoAgressor(String nomeDoAgressor) {
		this.nomeDoAgressor = nomeDoAgressor;
	}

	public String getSexoDoAgressor() {
		return sexoDoAgressor;
	}

	public void setSexoDoAgressor(String sexoDoAgressor) {
		this.sexoDoAgressor = sexoDoAgressor;
	}

	public Integer getIdadeDoAgressor() {
		return idadeDoAgressor;
	}

	public void setIdadeDoAgressor(Integer idadeDoAgressor) {
		this.idadeDoAgressor = idadeDoAgressor;
	}

	public String getGrauParentescoDoAgressor() {
		return grauParentescoDoAgressor;
	}

	public void setGrauParentescoDoAgressor(String grauParentescoDoAgressor) {
		this.grauParentescoDoAgressor = grauParentescoDoAgressor;
	}

	public String getOcupacaoDoAgressor() {
		return ocupacaoDoAgressor;
	}

	public void setOcupacaoDoAgressor(String ocupacaoDoAgressor) {
		this.ocupacaoDoAgressor = ocupacaoDoAgressor;
	}

	public String getRacaCorDoAgressor() {
		return racaCorDoAgressor;
	}

	public void setRacaCorDoAgressor(String racaCorDoAgressor) {
		this.racaCorDoAgressor = racaCorDoAgressor;
	}

	public String getIdentidadeGeneroDoAgressor() {
		return identidadeGeneroDoAgressor;
	}

	public void setIdentidadeGeneroDoAgressor(String identidadeGeneroDoAgressor) {
		this.identidadeGeneroDoAgressor = identidadeGeneroDoAgressor;
	}

	public String getOrientacaoSexualDoAgressor() {
		return orientacaoSexualDoAgressor;
	}

	public void setOrientacaoSexualDoAgressor(String orientacaoSexualDoAgressor) {
		this.orientacaoSexualDoAgressor = orientacaoSexualDoAgressor;
	}

	public Integer getEscolaridadeDoAgressor() {
		return escolaridadeDoAgressor;
	}

	public void setEscolaridadeDoAgressor(Integer escolaridadeDoAgressor) {
		this.escolaridadeDoAgressor = escolaridadeDoAgressor;
	}

	public String getRelatoDoIncidente() {
		return relatoDoIncidente;
	}

	public void setRelatoDoIncidente(String relatoDoIncidente) {
		this.relatoDoIncidente = relatoDoIncidente;
	}

	public String getViolacaoDeDireito() {
		return violacaoDeDireito;
	}

	public void setViolacaoDeDireito(String violacaoDeDireito) {
		this.violacaoDeDireito = violacaoDeDireito;
	}

	public String getProvidencias() {
		return providencias;
	}

	public void setProvidencias(String providencias) {
		this.providencias = providencias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
