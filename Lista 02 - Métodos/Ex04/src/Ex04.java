// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-009] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que 
receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores.
 */

import java.util.Scanner;
import entities.MenorMath;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        MenorMath teste;
        teste = new MenorMath();

        System.out.print("Entre com o 1º número: ");
        teste.x = sc.nextInt();

        System.out.print("Entre com o 2º número: ");
        teste.y = sc.nextInt();

        int result = teste.valor();

        System.out.print("O Menor é: " + result);

        sc.close();
    }
}
