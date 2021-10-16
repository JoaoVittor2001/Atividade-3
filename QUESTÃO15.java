package Atividade3;

import java.util.Scanner;

public class QUESTÃO15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float num1 = 37;
		float num2 = 38;
		float div = 1;
		boolean CONT = true; 
		float produto = 0;
		while (CONT==true) {
		produto= (num1*num2)/div;
		num1 = num1 -1;
		num2 = num2 -1;
		div = div+1;
		System.out.println("("+num1+"X"+num2+")"+"/"+ div+" = "+produto);
		if ((num1==1)&&(num2==2)&&(div == 37))
		CONT=false;
		}
		entrada.close();
	}
}