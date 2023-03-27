package Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int NumerosPositivos = 0;
		int Soma = 0;
		
		do {
		System.out.println("Digite um valor:  ");	
		NumerosPositivos = sc.nextInt();
		
		if (NumerosPositivos >= 0) {
			Soma += NumerosPositivos;
		}
		}while (NumerosPositivos >= 0); 
			System.out.println("Somatorio dos valores: " + Soma);
			
			sc.close();
	}
}
