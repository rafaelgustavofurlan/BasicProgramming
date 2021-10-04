/*
 * Faca um algoritmo que conte de 1 a 100 e a cada 
 * multiplo de 10 emita uma mensagem: "Multiplo de 10".
 */

package geek;

public class Script2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i % 10 == 0) {
				System.out.println("Múltiplo de 10");
			}
		}
	}

}
