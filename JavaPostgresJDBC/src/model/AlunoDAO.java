package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public static void save(Aluno aluno) {
        String sql = "INSERT INTO aluno (id,nome,idade,estado) VALUES(default ,?,?,?)";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnectionToPostgres();
            pstm = con.prepareStatement(sql);
            pstm.setString(1, aluno.getNome());
            pstm.setInt(2, aluno.getIdade());
            pstm.setString(3, aluno.getEstado());
            pstm.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static List<Aluno> list() {
        List<Aluno> alunos = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstm = null;
        //Classe que recupera os dados do banco;
        ResultSet rset = null;

        try {
            con = ConnectionFactory.createConnectionToPostgres();
            pstm = con.prepareStatement("SELECT * FROM aluno");
            rset = pstm.executeQuery();
            while (rset.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rset.getInt("id"));
                aluno.setNome(rset.getString("nome"));
                aluno.setIdade(rset.getInt("idade"));
                aluno.setEstado(rset.getString("estado"));
                alunos.add(aluno);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
                if (rset != null) {
                    rset.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return alunos;
    }

    public static void delete(String nome) {
        String sql = "DELETE FROM aluno WHERE nome = '" + nome + "'";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnectionToPostgres();
            pstm = con.prepareStatement(sql);
            if (pstm.executeUpdate() == 0) {
                System.err.println("Erro ao deletar aluno");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void update(Aluno aluno, String nome) {
        String sql = "UPDATE aluno SET nome=?,idade=?,estado=? WHERE nome=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = ConnectionFactory.createConnectionToPostgres();
            pstm = con.prepareStatement(sql);
            pstm.setString(1, aluno.getNome());
            pstm.setInt(2, aluno.getIdade());
            pstm.setString(3, aluno.getEstado());
            pstm.setString(4, nome);
            pstm.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

