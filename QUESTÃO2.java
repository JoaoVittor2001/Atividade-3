package Atividade3;

import java.util.Scanner;

public class QUESTÃO2 {

	public static void main(String[] args) {
		
		boolean logico = true;
		Scanner entrada = new Scanner(System.in);
		while (logico == true) {
		System.out.print("Informe o nome :");
		String nome = entrada.next();
		System.out.print("Informe a senha :");
		String senha = entrada.next();
	    if (nome == senha) {
	    System.out.println("Dados invalidos");
	    System.out.println("-----------------");
	    } else {
		System.out.println("Dados validos");
    	logico = false;
		}    
	}
		entrada.close();
	}
}
