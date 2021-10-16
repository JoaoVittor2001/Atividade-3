package Atividade3;

import java.util.Scanner;

public class QUESTÃO12 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	int a = 1;
	int b = 0;
	int aux = 0;
	for (int i = 0; i <= 9; i++) {
	System.out.println(a);
	aux = a;
	a = a + b;
	b = aux;	
	} 	
	 entrada.close();
	}
}