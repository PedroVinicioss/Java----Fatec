//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*Escreva um programa em Java para gerar uma matriz quadrada H de dimensão N. Imprimir os elementos da diagonal secundária 
(linha + coluna = dimensão + 1). */

import java.util.Scanner;
import java.util.Random;

public class Ex10 {
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

        System.out.println("\n\nDiagonal secundária: ");

        y = n - 1;

        for(int x = 0; x <= n - 1; x++){
            System.out.print("\t" + matrizG [x][y]);
            y--;
        }

        sc.close();
    }
}