//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*Escreva um programa em Java para ler uma matriz D de dimensão N x M,
onde N e M não poderem ser menores que um. Gerar os elementos
aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios. O programa efetuar todas as
validações. Lembre-se de aproveitar os recursos da linguagem Java para
facilitar as validações. */

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i = 0, j = 0;

        System.out.println("Entre com o número de linhas para a Matriz D: ");
        i = sc.nextInt();

        System.out.println("Entre com o número de colunas para a Matriz D: ");
        j = sc.nextInt();

        int matrizD [][] = new int [i][j];

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
                matrizD [x][y] = random.nextInt(100);
            }
        }

        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matrizD [x][y]);
            }
        }

        sc.close();
    }
}