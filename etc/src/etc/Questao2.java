/**
 * Questao 2 - Teste de desenvolvedor - Target Sistemas 
 * 
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 *  sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 *  escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência 
 *  de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
**/

package etc;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		int primeiroValor = 0;
		int segundoValor = 1;
		int terceiroValor = 0;
		
		while(terceiroValor < numero) {
			terceiroValor = primeiroValor + segundoValor;
			primeiroValor = segundoValor;
			segundoValor = terceiroValor;
			
		}
		
		if(terceiroValor == numero) {
			System.out.println("Pertence");
		} else {
			System.out.println("Nao pertence");

		}
	}

}
