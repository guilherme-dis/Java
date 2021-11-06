package model;

import java.util.List;

public class App{
    public static void main(String[] args) {

        //Aluno a1=new Aluno("Guilherme","RJ",21);
        //AlunoDAO.save(a1);
        //AlunoDAO.delete("Guilherme");
        //Aluno a2=new Aluno("João","AM",91);
        //AlunoDAO.update(a2,"Fábio");

        List<Aluno> alunoList=AlunoDAO.list();
        alunoList.forEach(System.out::println);
    }
}
