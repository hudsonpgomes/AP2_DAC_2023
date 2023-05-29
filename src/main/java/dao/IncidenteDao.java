package dao;

import static util.MessageUTIL.erro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Incidente;
import util.JPAUtil;

public class IncidenteDao {

	public static void salvar(Incidente incidente) {
		EntityManager em = JPAUtil.criarEntity();
		em.getTransaction().begin();
		em.persist(incidente);
		em.getTransaction().commit();
	}
	
	public static List<Incidente> listarTodos(){
		try {
			EntityManager em = JPAUtil.criarEntity();
			Query q = em.createQuery("SELECT i FROM Incidente i");
			return (List<Incidente>) q.getResultList();
		} catch(Exception ex) {
			erro("Erro", "Erro ao listar. " + ex.getMessage());
			return null;
		}
	}
	
	public static void deletar(Incidente incidente) {
		EntityManager em = JPAUtil.criarEntity();
		em.getTransaction().begin();
		incidente = em.find(Incidente.class, incidente.getId());
		em.remove(incidente);
		em.getTransaction().commit();
		em.close();
	}
	
}
