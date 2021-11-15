package tests;

import dao.*;
import model.Aluno;

public class App {
    public static void main(String[] args) {
        DAO dao=new DAO();

        dao.findAll(Aluno.class).forEach(System.out::println);
    }
}

