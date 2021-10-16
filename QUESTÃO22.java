package Atividade3;

import java.util.Scanner;

public class QUESTÃO22 {

	public static void main(String[] args) {
		
	  Scanner entrada = new Scanner(System.in);
	  System.out.println("Qual o numero total de pessoas que votaram");
	  int votantes = entrada.nextInt();
	  int candidato1 =0;
      int candidato2 =0;
	  int candidato3 =0;		
	  for (int i=1;i<=votantes;i++) {
		System.out.println("Qual seu voto? 1,2 ou 3");
		int voto = entrada.nextInt();	
		if(voto==1)
			candidato1= candidato1 + 1;
		else if(voto==2)
			candidato2= candidato2 + 1;
		else if(voto==3)
			candidato3= candidato3 + 1;
		else
			System.out.println("numero Invalido");
	}
	System.out.println("O numero de votos do candidato 1 é "+candidato1);		System.out.println("O numero de votos do candidato 2 é "+candidato2);
	System.out.println("O numero de votos do candidato 3 é "+candidato3);
	   entrada.close();
	}
}