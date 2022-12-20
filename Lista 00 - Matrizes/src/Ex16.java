//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para gerar uma matriz quadrada P de dimensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e
abaixo da diagonal secundária (inclusa)
 */

import java.util.Scanner;
import java.util.Random;

public class Ex16{
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = 0, y = 0;

        System.out.print("Entre com a dimensão da matriz: ");
        n = sc.nextInt();

        int matrizG [][] = new int [n][n];

        for(int x = 0; x <= n - 1; x++){
            for(y = 0; y <= n - 1; y++){
                matrizG [x][y] = random.nextInt(25);
            }
        }

        System.out.println("\nMatriz gerada: ");

        for(int x = 0; x <= n - 1; x++){
            System.out.println();
            for(y = 0; y <= n - 1; y++){
                System.out.print("\t" + matrizG [x][y]);
            }
        }

        System.out.println("\n\nDiagonal principal inclusa: ");

        y = 0;

        for(int x = 1; x <= n - 1; x++){
            System.out.print("\t" + matrizG [x][y]);
            y++;
        }

        System.out.println("\n\nDiagonal secundária inclusa: ");

        y = n - 1;

        for(int x = 1; x <= n - 1; x++){
            System.out.print("\t" + matrizG [x][y]);
            y--;
        }

        sc.close();
    }
}