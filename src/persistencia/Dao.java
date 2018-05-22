package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	// Gerenciar a conexao com o banco de dados
	Connection conn;
	// Manipula as querys no banco de dados (executa as querys)
	PreparedStatement stmt;
	// Manipula o resultado da consulta
	ResultSet rs;

	private final String URL = "jdbc:mysql://localhost:3306/cervejaria";
	private final String USER = "root";// usuário do banco de dados
	private final String PASS = "";// senha do banco

	public void open() throws Exception {
		// Carregar o Drive de conexao com o Mysql
		Class.forName("com.mysql.jdbc.Driver");
		// Abrir a conexao com o banco d dados
		conn = DriverManager.getConnection(URL, USER, PASS);
	}

	public void close() throws Exception {
		conn.close();
		stmt.close();
	}

	public static void main(String[] args) {
		try {
			Dao d = new Dao();
			d.open();
			d.close();
			System.out.println("Conectei...");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu Ruim....");
		}
	}

}
