package Atividade3;

import java.util.Scanner;

public class QUESTÃO23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero de turmas");
		int numt = entrada.nextInt ();
		System.out.println("Numero de alunos por turma");
		int numa = entrada.nextInt ();
		float media = (numa/numt);
		if (media<=40) {
		System.out.println("Turma OK");
		}
		else {
		System.out.println("Superlota��o de alunos");
		}
		entrada.close();
	}
}