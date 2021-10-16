package Atividade3;

import java.util.Scanner;

public class QUESTÃO7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o menor numero: ");
		int menor = entrada.nextInt();
		System.out.println("Informe o maior numero: ");
		int maior = entrada.nextInt();
		int soma = 0;
		while (menor < maior) {
		menor++;
		System.out.println("menor numero : " + menor);
		}
		entrada.close();
	}
}