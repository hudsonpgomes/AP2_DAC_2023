package bean;

import static util.MessageUTIL.erro;
import static util.MessageUTIL.sucesso;
import static util.MessageUTIL.exibirDetalhes;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IncidenteDao;
import entidades.Incidente;

@ManagedBean(name = "incidenteBean")
public class IncidenteBean {
	
	private Incidente incidente = new Incidente();
	private List<Incidente> lista;
	
	public String salvar() {
		try {
			IncidenteDao.salvar(this.incidente);
			sucesso("Sucesso", "Denuncia salva com sucesso! ID: " + this.incidente.getId());
			this.incidente = new Incidente();
		} catch (Exception ex) {
			erro("Erro", "Erro ao salvar. " + ex.getMessage());
		}
		return null;
	}
	
	public String deletar() {
		IncidenteDao.deletar(incidente);
		sucesso("Sucesso", "Denuncia deletada ");
		this.incidente = new Incidente();
		this.lista = IncidenteDao.listarTodos();
		return null;
	}
	
	public void detalhesDoAgressor(Incidente i) {
		String detalhes = "Agressor: "+i.getNomeDoAgressor()+", Sexo: "+i.getSexoDoAgressor()+", Idade: "+i.getIdadeDoAgressor()+
				", Grau Parentesco: "+i.getGrauParentescoDoAgressor()+", Ocupação: "+i.getOcupacaoDoAgressor()+", Raça/Cor: "+
				i.getRacaCorDoAgressor()+", Identidade de gênero: "+i.getIdentidadeGeneroDoAgressor()+", Orientação sexual: "+
				i.getOrientacaoSexualDoAgressor()+", Escolaridade: "+i.getEscolaridadeDoAgressor()+", Relato do Incidente: "+
				i.getRelatoDoIncidente()+", Tipo de violação de direito: "+i.getViolacaoDeDireito()+", Providências tomadas: "+
				i.getProvidencias();
		exibirDetalhes("Detalhes do Incidente", detalhes);
	}
	
	public Incidente getIncidente() {
		return incidente;
	}
	
	public void setIncidente(Incidente incidente) {
		this.incidente = incidente;
	}
	
	public List<Incidente> getLista() {
		this.lista = IncidenteDao.listarTodos();
		return this.lista;
	}
	
	public void setLista(List<Incidente> lista) {
		this.lista = lista;
	}
	
}
