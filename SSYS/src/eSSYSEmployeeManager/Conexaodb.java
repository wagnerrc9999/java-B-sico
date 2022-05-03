/**
 * 
 */
package eSSYSEmployeeManager;

/**
 * @author wagner
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Conexaodb {

	//Variaveis globais
		public Statement stm;
		private Connection con;

	    /**
		 *    Descricao: Conecta no banco e cria o Statement.
		 * Data Criacao: 14/06/2012
		 */
	    public boolean conectar(){
	    	boolean conectado = false;
			try {
				Class.forName("org.postgresql.Driver");
	            String url = "jdbc:postgresql://localhost:5432/";  
	            String usuario = "Usuario";
	            String senha = "Usersenha";
	            con = DriverManager.getConnection(url, usuario, senha);
	            stm = con.createStatement();
	            conectado = true;
	        } catch (Exception e) {
	        	//System.out.println("Erro em Conectar: " + e.getMessage());
	        	while(!conectado){
	            	System.out.println("Tentativa de conexao... (status: " + conectado + ").");
	    			conectado = this.conectar();
	    			System.out.println("Tentativa de conexao... (status: " + conectado + ").");
	    		}
	        }

	        return conectado;
		}
	    public void desconectar(){
	        try {
	        	con.close();  
			} catch (SQLException e) {
				System.out.println("Erro SQL ao fechar conexao: " + e.getMessage());
				e.printStackTrace();
			}
		}

	    /**
		 *    Descricao: Invoca o metodo para executar a SQL.
		 * Data Criacao: 14/06/2012
		 */
	    public Integer executarQuery(String query){
	    	Integer resp = 0;
	    	try {
	   			this.conectar();
	    		if(query.substring(0, 6).toUpperCase().equals("SELECT")){
	            	ResultSet rs = stm.executeQuery(query);
	            	if(rs.next())
	            		resp = rs.getInt("resp");
	            }else{
	            	resp = stm.executeUpdate(query);
	            }
	    		this.desconectar();
	    	} catch (SQLException e) {
	            System.out.println("Erro SQL ao executar Query: " + e.getMessage());
	    	}
	    	return resp;
	    }

	}
