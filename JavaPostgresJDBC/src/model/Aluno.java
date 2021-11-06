package model;

public class Aluno {
    private String nome, estado;
    private int idade, id;

    public Aluno( String nome, String estado, int idade) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.idade = idade;
    }

    public Aluno() {}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", idade=" + idade +
                ", id=" + id +
                '}';
    }
}
