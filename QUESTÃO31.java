package Atividade3;

import java.util.Scanner;

public class QUEST�O31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numeroalto= 0;
		int numerobaixo=0;
		double alto = 0;
		double baixo = 0;
		for (int i=1;i<=2;i++) {
		System.out.println("Qual  o seu Numero");
		int numero = entrada.nextInt();
		System.out.println("Qual sua altura em cent�metros?");
	    double altura = entrada.nextDouble();
		if(i==1) {
	    numeroalto =numero;
		numerobaixo = numero;
		alto = altura;
	    baixo = altura;	
		}
		else if(altura>alto) {
		alto = altura;
		numeroalto =numero;	
		}
		else if (altura<baixo) {
		baixo = altura;
		numerobaixo=numero;
		}	
		}
		entrada.close();
		System.out.println("O altura  do mais alto � "+ alto +" e o numero � "+numeroalto);
		System.out.println("O altura  do mais baixo � "+ baixo +" e o numero � "+numerobaixo);
     	}
}