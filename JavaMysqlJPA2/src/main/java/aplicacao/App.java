package aplicacao;

import dominio.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        Aluno a1=new Aluno(null,21,55.0,"Cavalo Panffgaré","MG");
        //System.out.println(a1);

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em=emf.createEntityManager();


        em.getTransaction().begin();
        //em.persist(a1);

        //Aluno a1=em.find(Aluno.class,2);
        //System.out.println(a2);
        //em.persist(a1);
        //em.remove(em.find(Aluno.class,1));


        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
