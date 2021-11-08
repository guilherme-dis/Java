package tests;

import dao.AlunoDAO;
import dao.ProfessorDAO;
import model.Aluno;
import model.Professor;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Professor p1=new Professor(2,"Carlin","AM","Matematica",50);


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
        ProfessorDAO.findAll().forEach(System.out::println);
    }
}

