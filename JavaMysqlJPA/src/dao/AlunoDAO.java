package dao;

import connection.ConnectionFactory;
import model.Aluno;

import javax.persistence.EntityManager;
import java.util.List;

public class AlunoDAO {
    public static void save(Aluno aluno) {
        EntityManager entityManager = new ConnectionFactory().getConnetion();
        try {
            entityManager.getTransaction().begin();
            if (aluno.getId() == null) {
                entityManager.persist(aluno);
            } else {
                entityManager.merge(aluno);
            }
            entityManager.persist(aluno);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.err.println(e);
        } finally {
            entityManager.close();
        }
    }

    public static Aluno findById(int id) {
        EntityManager entityManager = new ConnectionFactory().getConnetion();
        Aluno a = null;
        try {
            a = entityManager.find(Aluno.class, id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            entityManager.close();
        }
        return a;
    }

    public static List<Aluno> findAll() {
        EntityManager entityManager = new ConnectionFactory().getConnetion();
        List list = null;
        try {
            list = entityManager.createQuery("from Aluno").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            entityManager.close();
        }
        return list;
    }

    public static boolean remove(int id) {
        EntityManager entityManager = new ConnectionFactory().getConnetion();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.find(Aluno.class, id));
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
        }
    }
}
