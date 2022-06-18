/**
 * Questao 4 - Teste de desenvolvedor - Target Sistemas	
 * 
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

	SP – R$67.836,43
	RJ – R$36.678,66
	MG – R$29.229,88
	ES – R$27.165,48
	Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde 
calcule o percentual de representação que cada estado teve 
dentro do valor total mensal da distribuidora.
**/

package etc;

public class Questao4 {

	public static void main(String[] args) {
		
		double saoPaulo = 67836.43;
		double rioDeJaneiro = 36678.66;
		double minasGerais = 29229.88;
		double espiritoSanto = 27165.48;
		double outrosEstados = 19849.53;
		
		double total = saoPaulo + rioDeJaneiro + minasGerais + 
					   espiritoSanto + outrosEstados;
		
		System.out.println("Valor Total: " + total);
		
		double reprSaoPaulo = (saoPaulo * 100) / total;
		double reprRioDeJaneiro = (rioDeJaneiro * 100) / total;
		double reprMinasGerais = (minasGerais * 100) / total;
		double reprEspiritoSanto = (espiritoSanto * 100) / total;
		double reprOutrosEstados = (outrosEstados * 100) / total;
		
		System.out.format("A representacao do estado de Sao Paulo foi de: %.2f%% \n", reprSaoPaulo);
		System.out.format("A representacao do estado do Rio de Jaeniro foi de: %.2f%%\n", reprRioDeJaneiro);
		System.out.format("A representacao do estado de Minas Gerais foi de: %.2f%%\n", reprMinasGerais);
		System.out.format("A representacao do estado do Espirito Santo foi de: %.2f%%\n", reprEspiritoSanto);
		System.out.format("A representacao de outros estados foi de: %.2f%%\n", reprOutrosEstados);
	
	}

}
