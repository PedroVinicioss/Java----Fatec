// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-008] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que 
receba esses 2 números como parâmetros de entrada, verifique e retorne o maior dos dois valores.
 */

import java.util.Scanner;
import entities.MaiorMath;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        MaiorMath teste;
        teste = new MaiorMath();

        System.out.print("Entre com o 1º número: ");
        teste.x = sc.nextInt();

        System.out.print("Entre com o 2º número: ");
        teste.y = sc.nextInt();

        int result = teste.valor();

        System.out.print("O Maior é: " + result);

        sc.close();
    }
}
