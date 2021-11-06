package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Para funcionar, tem que baixar o drive para o banco de dados escolhido.
 * Só colocar driver _nome do banco_ jdbc
 * instalar na dependencia do projeto ou da IDE
 */
public class ConnectionFactory {

    public static Connection createConnectionToPostgres() throws SQLException {

        String DATABASE_URL = "jdbc:postgresql://localhost:5432/digital_innovation_one";    //para se mysql, mudar ali para jdbc:mysql://localhost:_porta_//_Nome do banco_;
        String USERNAME = "postgres";                                                       //Usuário para acessar o banco.
        String PASSWORD = "root";                                                           //Senha o usuário

        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }
}
