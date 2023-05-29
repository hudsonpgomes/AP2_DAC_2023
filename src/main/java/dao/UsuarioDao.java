package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Usuario;
import util.JPAUtil;

public class UsuarioDao {

	public static void salvar(Usuario usuario) {
		EntityManager em = JPAUtil.criarEntity();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
	}
	
	public static List<Usuario> listarTodos(){
		EntityManager em = JPAUtil.criarEntity();
		Query q = em.createQuery("SELECT u FROM Usuario u");
		List<Usuario> lista = q.getResultList();
		em.close();
		return lista;
	}
	
	public static void deletar(Usuario usuario) {
		EntityManager em = JPAUtil.criarEntity();
		em.getTransaction().begin();
		usuario = em.find(Usuario.class, usuario.getId());
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	public static Usuario findUser(String login, String senha) {
		try {
			EntityManager em = JPAUtil.criarEntity();
			Query q = em.createQuery("Select u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
			q.setParameter("login", login);
			q.setParameter("senha", senha);
			return (Usuario) q.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	
}
