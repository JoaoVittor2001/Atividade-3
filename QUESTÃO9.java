package Atividade3;

import java.util.Scanner;

public class QUESTÃO9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe alguma Tabuada: ");
		int tabuada = entrada.nextInt();
		System.out.println("--------------");
		int i;
		for (i = 0; i <=10; i++) {
		System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
	}
}