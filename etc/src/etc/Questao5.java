/**
 * Questao 5 - Teste de desenvolvedor - Target Sistemas 
 * 
	5) Escreva um programa que inverta os caracteres de um string.

	IMPORTANTE:
	a) Essa string pode ser informada através de qualquer entrada 
	de sua preferência ou pode ser previamente definida no código;
	b) Evite usar funções prontas, como, por exemplo, reverse;
**/
package etc;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		String palavraInvertida = "";
		char ch;
		
		for(int i= 0; i < palavra.length(); i ++) {
			ch = palavra.charAt(i);
			palavraInvertida =  ch + palavraInvertida;
		}

		System.out.println("Palavra normal: " + palavra);
		System.out.println("Palavra invertida: " + palavraInvertida);
	}

}
