package Atividade3;

import java.util.Scanner;

public class QUESTÃO3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);		
		
		for (int i = 0; i <= 10; i++) { 
			System.out.println("Informe o seu nome: ");
			String n = entrada.nextLine();
			
    	if (n.length() <= 3) 
	        System.out.println("Invalido"); 
	        i = 0;
			
		    if (n.length() > 3) {  
			  System.out.println("Nome Valido" ); 
		    i = 10;}   
		    }
		for (int i = 0; i <= 10; i++) { 
			System.out.println("Informe a sua idade: ");
			int idade = entrada.nextInt();
		   
			if (idade < 0 || idade > 150)
				System.out.println("Idade Invalida"); 
	        i = 0;
	        
	        if (idade > 0 && idade < 150) {
	            System.out.println("Idade Valida" ); 
	        i = 10;}
	      }
		for (int i = 0; i <= 10; i++) { 
			System.out.println("Informe o seu salario: ");
			double sal = entrada.nextDouble();
		   
			if (sal < 0)
				System.out.println("Salario Invalido"); 
	        i = 0;
	        
	        if (sal > 0) {
	    
	        	System.out.println("Salario Valido" ); 
	      i = 10;}
	      
	      }
		
		for (int i = 0; i <= 10; i++) { 
			System.out.println("Informe o seu sexo, m ou f: ");
			String sex = entrada.next();
			
			 if (sex.equals ("M")) {
	             System.out.println("O sexo m: Masculino "); 
			 i = 10;
		
			 
	       if (sex.equals("F")) 
	           System.out.println("O sexo f: Femenino");
	           i = 10;
	        }else{
	       	System.out.println("Invalido");
	       	i = 0;
	     }
	   }
		for (int i = 0; i <= 10; i++) { 
			System.out.println("Informe o seu estado civil, v, s ,d ou c: ");
			String est = entrada.next();
			if (est.equals("v")) 
	            System.out.println("Viuva");
	            i = 10;
	        if (est.equals("s")) 
	            System.out.println("Solteiro");
	            i = 10;
	        if (est.equals("d")) 
	            System.out.println("Divorciada");
	            i = 10;
	        if (est.equals("c")) { 
	           System.out.println("Casado");
	           i = 10;           
	         }else{
	        	System.out.println("Invalido");
	        	i = 0;
	        }
	      }	
			entrada.close();
		}
	}