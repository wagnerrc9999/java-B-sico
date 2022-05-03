package eSSYSEmployeeManager;

package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author postgresqltutorial.com
 */
public class ConexaoBancoDeDados{

    private final String url = "jdbc:postgresql://localhost/dvdrental";
    private final String user = "postgres";
    private final String password = "<add your password>";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com o Banco De Dados com Sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.connect();
    }
}


public class ConexaoBancoDeDados {
	
	

	private static final String USERNAME = "Usuario"; // Nome de usuario do Banco De Dados Oracle ou PostgreSQL.
	private static final String PASSWORD = "Usuario4567"; // Senha do Banco.
	// Caminho
	private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432";

	
	// Conexão
	public static Connection createConnectionToPostgreSQL() throws Exception {
		Class.forName("org.postgresql.Driver");
	}
		Connection conexao = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return conexao;
		
		catch (ClassNotFoundException) {
		    // Erro caso o driver JDBC não foi instalado
		    e.printStackTrace();
		} catch (SQLException e) {
		    // Erro caso haja problemas para se conectar ao banco de dados
		    e.printStackTrace();
		}
		
		public static void main(String[] args) {
	        // auto close connection
	        try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/test", "postgres", "password")) {

	            if (conn != null) {
	                System.out.println("Conectado com o Banco De Dados!");
	            } else {
	                System.out.println("Não POdemos conectar!");
	            }

	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
	}