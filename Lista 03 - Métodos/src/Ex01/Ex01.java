package Main;

//Pedro VInicios de Oliveira Ribeiro dos Santos

/*[POO-014] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit. O usuário 
deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de 
conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro 
de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a 
fórmula F= (9*C/5) + 32 */

import java.util.Scanner;
import Main.Conversor;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conversor conversor = new Conversor();
		
		
		System.out.print("Entre com temperatura em Celsius: ");
		int temp_Celsius = sc.nextInt();
		
		int result = conversor.converter(temp_Celsius);
		
		System.out.print("A temperatura em Fahrenheit é: " + result);
		
		sc.close();
	}

}
