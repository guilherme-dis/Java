package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Aluno{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idade;
    private Double nota;
    private String nome,estado;
    public Aluno(){
    }



    public Aluno(Integer id, Integer idade, Double nota, String nome, String estado) {
        this.id = id;
        this.idade = idade;
        this.nota = nota;
        this.nome = nome;
        this.estado = estado;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
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

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", idade=" + idade +
                ", nota=" + nota +
                ", nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
