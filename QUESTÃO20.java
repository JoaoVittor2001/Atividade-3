package Atividade3;

import java.util.Scanner;

public class QUESTÃO20 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	float a = 0;
	float j = 0;
	for (int i = 0; i <= 100; i++) {
	System.out.println("Informe uma nota: ");
	float n = entrada.nextFloat();
		 a = (n + a);
		 j = (a / i);		 
		 if(n == 0) {
	     i = 100;
	     }			 
	 }
	 System.out.print("Media: " + j);
		 entrada.close();
	}
}