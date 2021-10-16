package Atividade3;

import java.util.Scanner;

public class QUESTÃO27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		boolean chave = true; 
		double produto = 1;
		int K = 0;
		while(chave==true) {
		if(produto!=0) {
		K=K+1;
		System.out.println("Digite o Valor do produto");
		produto = entrada.nextDouble();
		total = total+produto;
		System.out.println("Produto"+ K +" = "+produto);
		}else
		chave=false;
	    }
		System.out.println("Total = "+ total);
		System.out.println("Valor em dinheiro");
		double valor = entrada.nextDouble();
		System.out.println("Valor do troco é "+(valor-total) );
		entrada.close();
     	}
}