package Atividade3;

import java.util.Scanner;

public class QUESTÃO21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);		
		float a = 0;
		float j = 0;
		for (int i = 0; i <= 100; i++) {
		System.out.println("Digite a sua Idade: ");
		float n = entrada.nextFloat();		 
		a = (n + a);
		j = (a / i); 
		if(n == 0) { 
		i = 100;
		}	 
		}
		if (j > 60) {
			 System.out.println("Media: " + j + " Idosa");  
		}else if (j > 0 && j < 25) { 
			 System.out.println("Media: " + j + " Jovem");
		}else if (j >= 25 && j < 60) {
			 System.out.println("Media: " + j + " Adulta");
		}
			 entrada.close();
	}
}