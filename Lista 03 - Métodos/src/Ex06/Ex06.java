package Main;

import java.util.Scanner;

//Pedro Vinicios de Oliveira Ribeiro dos Santos]

/*[POO-019] Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados 
como parâmetros de entrada para um método que irá gerar todos os números primos existentes no 
intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com 
a responsabilidade de imprimir o array de primos retornado pelo método. O método deve aceitar e 
entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1. */

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vetor [] = new int [1000];
		Primos primos = new Primos();
		int y = 1, x = 1;
		
		System.out.print("\nEntre com o 1º número:");
		y = sc.nextInt();
		
		System.out.print("\nEntre com o 2º número:");
		x = sc.nextInt();
		
		for(int z = y; z <= x; z++) {
			if(z < 3) {
				System.out.print(z + "\t");
			}
			else{
				
				boolean num = primos.ehPrimo(z);	
				if(num == true) 
					System.out.print(z + "\t");
			}
		}

		
		sc.close();
		
	}

}
