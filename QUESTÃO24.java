package Atividade3;

import java.util.Scanner;

public class QUESTÃO24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quantidade de CDs : ");
		int qcd = entrada.nextInt ();
		System.out.print("Valor unitario : ");
		float vu = entrada.nextFloat ();
		float media = (qcd/vu);
		float total = (qcd*vu);	
		System.out.println("Valor medio : " + media);
		System.out.println("Total ivestido : " + total);
		entrada.close();
	}
}