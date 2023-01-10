package Gerenciamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Gerenciamento {
	public static void main(String[] args) throws SQLException {

		System.out.println(">>>>>>>>SEJA BEM VINDO<<<<<<<<<<<\n");
		System.out.println("Selecione uma das opções para executar o comando\n\n"
				+ "1 > Criar banco de dados\n"
				+ "2 > Inserir tabela\n"
				+ "3 > Inserir registro\n"
				+ "4 > Testar conexao\n");
		

		Scanner entrada = new Scanner(System.in);
		Scanner user = new Scanner(System.in);
		Scanner pass = new Scanner(System.in);
		Scanner valor = new Scanner(System.in);
		
		String database = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		
		System.out.print("Digite usuario: ");
		String loginuser = user.nextLine();
		
		System.out.print("Digite a senha: ");
		String password = pass.next();
		Connection conexao = DriverManager.getConnection(database, loginuser, password);
        Statement stmt = conexao.createStatement();

		System.out.println("\nDigite uma das opções: ");
		int option = entrada.nextInt();

		if(option == 1) {
			System.out.print("Digite o nome do seu banco de dados: ");	
			String nome = valor.next();
			try {
			stmt.execute("create database " + nome);
			System.out.println("Banco de dados criado com sucesso");
			}catch(SQLException e){
				System.out.println("Banco de dados já existe");
			}
		}if(option == 2) {
			
		}
	}
}
