package bean;

import static util.MessageUTIL.erro;
import static util.MessageUTIL.sucesso;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.UsuarioDao;
import entidades.Usuario;

@ManagedBean(name = "usuarioBean")
@SessionScoped
public class UsuarioBean {
	
	private String login;
	private String senha;
	private Usuario usuario = new Usuario();
	private boolean logado;
	private List<Usuario> lista;
	
	public String salvar() {
		try {
			UsuarioDao.salvar(usuario);
			sucesso("Sucesso", "Usuário " + usuario.getLogin() + " salvo com sucesso.");
			usuario = new Usuario();
		} catch (Exception ex) {
			erro("Erro", "Erro ao salvar. " + ex.getMessage());
		}
		return null;
	}
	public String deletar() {
		UsuarioDao.deletar(usuario);
		sucesso("Sucesso", "Usuário " + usuario.getLogin() + " deletado com sucesso!");
		this.lista = UsuarioDao.listarTodos();
		return null;
	}
	public String userAutentication() {
		usuario = UsuarioDao.findUser(login, senha);
		if(usuario != null) {
			logado = true;
			return "/listagem_incidente.xhtml?faces-redirect=true";
		} else {
			usuario = new Usuario();
			erro("Erro", "Usuário " + login + " não registrado!");
		}
		return null;
	}
	public String logout() {
		logado = false;
		usuario = new Usuario();
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public boolean isLogado() {
		return logado;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
	public List<Usuario> getLista() {
		this.lista = UsuarioDao.listarTodos();
		return this.lista;
	}
	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}
	
}
