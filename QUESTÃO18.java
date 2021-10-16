package Atividade3;

import java.util.Scanner;

public class QUESTÃO18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		float numero =entrada.nextFloat();
		if ((numero%2)==0|| (numero%3)==0) {
		System.out.println(numero+" não é primo");
		System.out.print("Os Divisores de "+numero+" são ");
	    for(int i=1;i<=numero;i++) {
		if ((numero%i)==0)
		System.out.println(i+"|");
		}
		}else 
		System.out.println("é primo");		
		entrada.close();
	}
}