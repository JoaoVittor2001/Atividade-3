package Atividade3;

import java.util.Scanner;

public class QUEST�O17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		float numero =entrada.nextFloat();
		if (((numero%1)==0)&&((numero%numero)==0)&&((numero%2)!=0))
	    System.out.println(numero+" � primo");
		else
	    System.out.println(numero+" n�o � primo");
		entrada.close();	
	}
}