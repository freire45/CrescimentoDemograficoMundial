package br.com.erickfreire.crescimentodemograficomundial;

import java.util.Scanner;

/**
 * Programa em Java que calcula o crescimento demografico mundial para os próximos 75 anos
 * @author Erick Freire
 * @version 1 - Criado em 14-04-2021 as 17:29
 */

public class CrescimentoDemograficoMundial {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		double populacao;
		double taxaDeCrescimento;
		double calculo;
		int contador = 1;
		
		System.out.print("Digite o numero da população mundial: ");
		populacao = entrada.nextDouble();
		
		System.out.print("Digite a taxa de crescimento mundial: ");
		taxaDeCrescimento = entrada.nextDouble();
		
		calculo = ((populacao * (taxaDeCrescimento / 100)) + populacao);
		
		while(contador <= 75) {
			System.out.printf("Ano %d: \t%.2f Bilhões%n",contador, calculo);		
			calculo = ((calculo * (taxaDeCrescimento / 100) + calculo));	
			contador++;
		}
		
	}

}
