package Atividade3;

import java.util.Scanner;

public class QUESTÃO1 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		boolean logico = true;
		while (logico == true) {
		System.out.print("Informe uma nota :");
		int nota = entrada.nextInt();
		if ((nota>=0) && (nota <=10)) {
		System.out.println("Ok, nota valida");
		logico = false;		
		} 
		else {
		System.out.println("Nota inv�lida");
		System.out.println("-----------------");
		}
	 }		
   }
}
