package Main;

//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-018] Crie um programa que imprima na tela todos os números primos de 1 até 1000. Para tanto, 
crie um método que receba um número inteiro como parâmetro de entrada e verifique se este número é 
primo ou não retornando um boolean como resposta.*/

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vetor [] = new int [1000];
		Primos primos = new Primos();
		int y = 1;
		
		for(y = 1; y <= 1000; y++) {
			if(y < 3) {
				System.out.print(y + ", ");
			}
			else{
				
				boolean num = primos.ehPrimo(y);	
				if(num == true)
					System.out.print(y + ", ");
			}
		}
		
		System.out.print("\nEntre com um número:");
		y = sc.nextInt();
		
		boolean num = primos.ehPrimo(y);
		
		if(num == true)
			System.out.print("É Primo!");
		else
			System.out.print("Não é Primo!");

		
		sc.close();
	}

}
