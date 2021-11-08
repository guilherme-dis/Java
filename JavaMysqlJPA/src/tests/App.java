package tests;

import dao.*;
import model.Aluno;
import model.Professor;

public class App {
    public static void main(String[] args) {
        DAO dao=new DAO();
    /*
        Professor p1=new Professor(null,"Rodrigo","AM","Matematica",50);
        Professor p2=new Professor(null,"Mariana","AM","Matematica",50);
        Aluno a1=new Aluno(null,"Vagner","MG",25,p1);
        Aluno a2=new Aluno(null,"pamela","MG",25,p2);


        dao.save(p1);
        dao.save(p2);
        dao.save(a1);
        dao.save(a2);

        dao.remove(Aluno.class,5);*/

        //System.out.println(ProfessorDAO.findById(4));
        //ProfessorDAO.findAll().forEach(System.out::println);
        //ProfessorDAO.save(p1);
        //ProfessorDAO.remove(3);
        //ProfessorDAO.findAll().forEach(System.out::println);

        //ProfessorDAO.save(p1);
        //Aluno a1=new Aluno(null,"Fernando","SP",43,ProfessorDAO.findById(1));
        //AlunoDAO.save(a1);
        //System.out.println(AlunoDAO.findById(3));;
        //AlunoDAO.remove(3);
        //ProfessorDAO.findAll().forEach(System.out::println);

        //dao.save(p1);
        //dao.remove(Professor.class,11);
        dao.findAll(Professor.class).forEach(System.out::println);
        dao.findAll(Aluno.class).forEach(System.out::println);
        //System.out.println(dao.findById(Professor.class,4));
        //
    }
}

