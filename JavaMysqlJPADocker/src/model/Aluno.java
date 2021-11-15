package model;

import dao.EntidadeBase;

import javax.persistence.*;

@Table(name = "aluno")
@Entity
public class Aluno implements EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome, estado;
    private Integer idade;

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", idade=" + idade +
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


    public Aluno(Integer id, String nome, String estado, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.idade = idade;
    }
}