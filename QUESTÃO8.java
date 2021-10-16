package Atividade3;

import java.util.Scanner;

public class QUESTÃO8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o menor numero: ");
		int menor = entrada.nextInt();
		System.out.println("Informe o maior numero: ");
		int maior = entrada.nextInt();
		int soma = 0;
		while (menor < maior) {
		menor++;
		soma = soma + (menor);
		System.out.println("menor numero : " + menor);
		}
		System.out.println("-----------");
		System.out.println("Soma dos numeros : " + soma);	
		entrada.close();
	}
}