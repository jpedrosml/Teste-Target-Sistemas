
/**
 * Questao 3 - Teste de desenvolvedor - Target Sistemas	
 * 
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, 
 * faça um programa, na linguagem que desejar, que calcule e retorne:
	• O menor valor de faturamento ocorrido em um dia do mês;
	• O maior valor de faturamento ocorrido em um dia do mês;
	• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
	a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
	b) Podem existir dias sem faturamento, como nos finais de semana e feriados. 
	Estes dias devem ser ignorados no cálculo da média;
**/

package etc;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

public class Questao3 {

	public static void main(String[] args) throws IOException {
		
		Gson gson = new Gson();
		
		Reader reader = Files.newBufferedReader(Paths.get("./dados.json"));
		
		List<DadosQuestao3> dados = Arrays.asList(gson.fromJson(reader, DadosQuestao3[].class));
		
		ArrayList<Double> valores = new ArrayList<Double>();
	
		//Passando os valores do array de dados para o array de valores
		for(int i = 0; i < dados.size(); i++) {
			valores.add(dados.get(i).getValor()); 
		}
		
		//Maior valor em um mes
		Double max = Collections.max(valores);
		System.out.println("Maior valor: "  + max);
		
		//Menor valor em um mes
		
		Double min = Collections.min(valores);
		System.out.println("Menor valor: " + min);
		
		//Somando todos os valores para fazer a media
		
		double soma = 0;
		
		for(int j = 0; j < valores.size(); j++) {
			soma += valores.get(j);
		}
		
		double media = soma / 30;
		
		System.out.println("Media: " + media);
		
		//Descobrindo quais dias tiveram um valor maior que a media;
		
		int numDias = 0 ;
		
		for(int k = 0; k < valores.size(); k++) {
			if(valores.get(k) > media) {
				numDias++;
			}
		}
		
		System.out.println("Numero de dias em que o faturamento foi maior que a media: " + numDias);
		
		
	}

}