package model;

import dao.EntidadeBase;
import model.Professor;

import javax.persistence.*;

@Table(name = "aluno")
@Entity
public class Aluno implements EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome, estado;
    private Integer idade;
    @ManyToOne
    private Professor professor;

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", idade=" + idade +
                ", professor=" + professor +
                '}';
    }

    public Aluno() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno(Integer id, String nome, String estado, Integer idade, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.idade = idade;
        this.professor = professor;
    }
}