package Main;

//Pedro VInicios de Oliveira Ribeiro dos Santos

/*[POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O 
usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a 
entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de 
conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como 
parâmetro de entrada e retorne a temperatura convertida. Para os cálculos de conversão, utilize as
fórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuário 
desejar. */

import java.util.Scanner;
import Main.Conversor;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conversor conversor = new Conversor();
		
		int x = 0, temp = 0;
		
		while(x == 0) {
			System.out.print("\n[C]Celsius, [F] Fahrenheit e [S] Sair: ");
			char escolha = sc.next().charAt(0);
			
			if(escolha == 'C' || escolha == 'c') {
				
				System.out.print("Entre com a temperatura: ");
				temp = sc.nextInt();
				int result = conversor.goFahrenheit(temp);
				System.out.print("\tSaída: " + result);

				
			}else if(escolha == 'F' || escolha == 'f') {
				
				System.out.print("Entre com a temperatura: ");
				temp = sc.nextInt();
				int result = conversor.goCelsius(temp);
				System.out.print("\tSaída: " + result);

			
			}else if(escolha == 'S' || escolha == 's') {
				
				x = 1;
			
			}else {
				
				System.out.println("\tOpção Inválida!");
				
			}
		}

		
		sc.close();
	}

}
