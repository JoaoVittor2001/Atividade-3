package Atividade3;

import java.util.Scanner;

public class QUESTÃO16 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	int valor[] = new int[5];
	int maior = 0, menor = 0; 
		
	for(int i = 0; i < valor.length; i++){
		System.out.print("Informe o " +(i+1)+"� valor: ");
		valor[i] = entrada.nextInt();
		if(valor[i] > maior){ 
	     	maior = valor[i];
		}
	}
	for (int j = 0; j < valor.length; j++) {
	    if(valor[j] < menor){
			menor = valor[j];
		}
	}
	System.out.println("Maior valor = "+ maior);
	System.out.println("Menor valor = "+ menor);
	entrada.close();	
	}
}