package Atividade3;

import java.util.Scanner;

public class QUEST�O18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		float numero =entrada.nextFloat();
		if ((numero%2)==0|| (numero%3)==0) {
		System.out.println(numero+" n�o � primo");
		System.out.print("Os Divisores de "+numero+" s�o ");
	    for(int i=1;i<=numero;i++) {
		if ((numero%i)==0)
		System.out.println(i+"|");
		}
		}else 
		System.out.println("� primo");		
		entrada.close();
	}
}