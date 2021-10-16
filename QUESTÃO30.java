package Atividade3;

import java.util.Scanner;

public class QUESTÃO30 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		boolean chave = true; 
		int K=0;
		double gordo =0;
		double magro =0;
		double alto=0;
		double baixo = 0;
		double mediap =0;
		double mediaA = 0;
		int codalto = 0;
		int codmagro = 0;
		int codbaixo =0;
		int codgordo = 0;
		int codigo = 0;	
		double altura=0;
		double peso =0;
		int valor = 0;		
		while(chave==true) {
		System.out.println("Digite seu codigo");
		codigo = entrada.nextInt();
		System.out.println("Digite sua altura");
		altura = entrada.nextDouble();
		System.out.println("Digite seu peso");
	    peso = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Digite 1-para continuar 0- para encerar o programa");
		valor = entrada.nextInt(); 
		K=(K+1);
		if(valor==0)
		chave=false;
		else {	
		if(altura<baixo) {
		mediaA = altura + altura;
		codbaixo = codigo;
		baixo = altura;	
	    }
		else if(altura>alto) {
		mediaA = altura + altura;
		codalto = codigo;
		alto = altura;
		}
		else if(peso<magro){
		codmagro = codigo;
		mediap = mediap+peso;
	    magro = peso;	
		}
		else if(peso>gordo) {
		codgordo = codigo;
		mediap = mediap+peso;
		gordo = peso;
		}
}
		
		
		
		
	}
		entrada.close();
		System.out.println("A pessoa mais alta  tem a altura : "+alto +"e seu codigo é"+codalto);
		System.out.println("A pessoa mais baixa  tem a altura : "+baixo +"e seu codigo é"+codbaixo);
		System.out.println("A pessoa mais magra  tem o peso : "+magro+"e seu codigo é"+codmagro);
		System.out.println("A pessoa mais gorda  tem o peso : "+gordo+"e seu codigo é"+codgordo);
		System.out.println("A media de pesos é "+(mediap/K));
		System.out.println("A media da altura é "+(mediaA/K));

	}

}
