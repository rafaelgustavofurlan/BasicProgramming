/*
 * Elabore um programa que gera e escreve os 
 * numeros impares dos numeros entre 100 e 200.
 */
package geek;

public class Script3 {

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
