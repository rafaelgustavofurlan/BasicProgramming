/*
 * Faca um programa que leia um nome de usuario e 
 * a senha e não aceite a senha igual ao nome do 
 * usuario, mostrando uma mensagem de erro e 
 * voltando pedir as informacoes.
 */

package geek;

import java.util.Scanner;

public class Script5 {

	public static void main(String[] args) {
		//variáveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		//processamento
		while(nome.equals(senha)) {
			System.out.println("Erro: O nome de usuário e senha devem ser diferentes.");
			//entrada
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}
		teclado.close();
	}

}
