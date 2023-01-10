package Gerenciamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import Gerenciamento.FabricaConexao;

public class Gerenciamento {
	public static void main(String[] args) throws SQLException {

		System.out.println(">>>>>>>>SEJA BEM VINDO<<<<<<<<<<<\n");
		System.out.println("Selecione uma das opções para executar o comando\n\n"
				+ "1 > Criar banco de dados\n"
				+ "2 > Inserir tabela\n"
				+ "3 > Inserir registro\n"
				+ "4 > Testar conexao\n");
		

		Scanner entrada = new Scanner(System.in);
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite a opção: ");
		int option = entrada.nextInt();

        
		if(option == 1) {
			System.out.print("Digite o nome do banco de dados: ");
			String nome = valor.next();
			Connection conexao = FabricaConexao.getConexao();
			
			
			entrada.close();
			valor.close();
		}
		
	}
}
