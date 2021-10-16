package Atividade3;

import java.util.Scanner;

public class QUESTÃO29 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor inicial");
		int valor0 = entrada.nextInt();
		System.out.println("Digite o valor Final");
		int valor = entrada.nextInt();
		if (valor0>valor)
	    System.out.println("Erro, o numero digitado que maior");	
	 	else
	    System.out.println("Voce quer a tabuada de que numero?");
		int num = entrada.nextInt();	
		for(int i=valor0;i<=valor;i++) {
		System.out.println(num+"X"+i+" = "+(num*i));	
		}
		entrada.close();
     	}
}