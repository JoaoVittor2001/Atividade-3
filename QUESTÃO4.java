package Atividade3;

public class QUESTÃO4 {

	public static void main(String[] args) {

	 double pop_a, pop_b, taxa_a, taxa_b = 0;
	 int ano;
     pop_a = 80000;
	 pop_b = 200000;
	 ano = 0;
     taxa_a = 1.03;
	 taxa_b = 1.015;
	 for  (pop_a = 80000; pop_a <= pop_b;) {
	 pop_a = pop_a * taxa_a;
	 pop_b  = pop_b * taxa_b;
	 ano = (ano + 1);	   
     }
	 System.out.print("População A: " + pop_a + "\nPopulação B: " + pop_b + "\nlevou " + ano + " anos");
	 }
}
