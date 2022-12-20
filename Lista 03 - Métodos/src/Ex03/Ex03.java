package Main;

//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*POO-016] ===Desafio!!!=== Semelhante ao exercício [POO-015] Crie um programa de conversão de
temperaturas, mas agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A 
saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit 
e Kelvin. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a 
temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos
de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser 
executado enquanto o usuário desejar.*/

import java.util.Scanner;
import Main.Conversor;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conversor conversor = new Conversor();
		
		int x = 0, temp = 0;
		
		while(x == 0) {
			System.out.print("\n[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
			char escolha = sc.next().charAt(0);
			
			if(escolha == 'C' || escolha == 'c') {
				
				System.out.print("Entre com a temperatura: ");
				temp = sc.nextInt();
				int result1 = conversor.goFahrenheit(temp);
				int result2 = conversor.goKelvin(temp);
				System.out.print("\tF: " + result1 + " e K: " + result2);

				
			}else if(escolha == 'F' || escolha == 'f') {
				
				System.out.print("Entre com a temperatura: ");
				temp = sc.nextInt();
				int result1 = conversor.goCelsius(temp);
				int result2 = conversor.goKelvin(result1);
				System.out.print("\tC: " + result1 + " e K: " + result2);

			
			}else if(escolha == 'K' || escolha == 'k') {
				
				System.out.print("Entre com a temperatura: ");
				temp = sc.nextInt();
				int result1 = conversor.goCelsius2(temp);
				int result2 = conversor.goFahrenheit(result1);
				System.out.print("\tC: " + result1 + " e F: " + result2);

			
			}else if(escolha == 'S' || escolha == 's') {
				
				x = 1;
			
			}else {
				
				System.out.println("\tOpção Inválida!");
				
			}
		}
		
		sc.close();
	}
}
