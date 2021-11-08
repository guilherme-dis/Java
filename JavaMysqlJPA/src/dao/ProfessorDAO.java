package dao;

import connection.ConnectionFactory;
import model.Professor;

import javax.persistence.EntityManager;
import java.util.List;

public class ProfessorDAO {

    public static void save(Professor o) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();

            if (o.getId() == null) {
                em.persist(o);
            } else {
                em.merge(o);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public static Professor findById(int id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        Professor prof = null;
        try {
            prof = em.find(Professor.class, id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return prof;
    }
    public static List<Professor> findAll(){
        EntityManager em = new ConnectionFactory().getConnetion();
        try{
            return  em.createQuery("from Professor ").getResultList();
        }catch (Exception e){
            System.err.println(e);
        }finally {
            em.close();
        }
        return null;
    }
    public static void remove(int id){
        EntityManager em = new ConnectionFactory().getConnetion();
        try{
            Professor prof=em.find(Professor.class,id);
            em.getTransaction().begin();
            em.remove(prof);
            em.getTransaction().commit();

        }catch (Exception e){
            System.err.println(e);
            em.getTransaction().rollback();

        }finally {
            em.close();
        }
    }
}
