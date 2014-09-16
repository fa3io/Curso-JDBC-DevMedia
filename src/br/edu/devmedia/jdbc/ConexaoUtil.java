package br.edu.devmedia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConexaoUtil {

	private static ConexaoUtil conexaoUtil;
	private static ResourceBundle config; // variavel de configuracao

	private ConexaoUtil() {
		config = ResourceBundle.getBundle("config"); // apontando a variavel para as configuracoes do nosso arquivo
							     //config com variaveis referente a conexao do banco
	}

	public static ConexaoUtil getInstance() {
		if (conexaoUtil == null) {
			conexaoUtil = new ConexaoUtil();
		}
		return conexaoUtil;
	}

	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName(config.getString("br.edu.devmedia.bd.driver.mysql"));
		return DriverManager.getConnection(
				config.getString("br.edu.devmedia.bd.url.conexao"),
				config.getString("br.edu.devmedia.bd.usuario"),
				config.getString("br.edu.devmedia.bd.senha"));
	}

}
