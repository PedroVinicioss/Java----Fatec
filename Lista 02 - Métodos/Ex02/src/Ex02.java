// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-007] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que 
receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores. */

import java.util.Scanner;
import entities.MenorMaior;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        MenorMaior teste;
        teste = new MenorMaior();

        System.out.print("Entre com o 1º número: ");
        teste.x = sc.nextInt();

        System.out.print("Entre com o 2º número: ");
        teste.y = sc.nextInt();

        int result = teste.comparation();

        System.out.print("O menor é: " + result);

        sc.close();
    }
}
