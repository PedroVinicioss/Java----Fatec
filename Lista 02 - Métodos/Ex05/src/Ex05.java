// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-010] Crie um programa que solicite ao usuário três números inteiros. Através de um método, que 
receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores.
 */

import java.util.Scanner;
import entities.MaiorMath;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        MaiorMath valor = new MaiorMath();

        System.out.print("Entre com o 1º número: ");
        int x = sc.nextInt();

        System.out.print("Entre com o 2º número: ");
        int y = sc.nextInt();

        System.out.print("Entre com o 2º número: ");
        int z = sc.nextInt();

        int result = valor.Maior(x , y, z);

        System.out.print("O Maior é: " + result);

        sc.close();
    }
}
