//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
Imprimir os elementos da “asa da borboleta”. */

import java.util.Scanner;

public class Ex19{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = 0, y = 0;

        System.out.print("Entre com a dimensão da matriz: ");
        n = sc.nextInt();

        int matrizG [][] = new int [n][n];

        for(int x = 0; x <= n - 1; x++){
            for(y = 0; y <= n - 1; y++){
                matrizG [x][y] = 1;
            }
        }

        System.out.println("\n\nBorboleta: ");

        int i = 0, j = n - 1;

        for(int x = 0; x <= n - 1; x++){
            matrizG [x][i] = 88;
            matrizG [x][j] = 88;
            i++;
            j--;
        }

        for(int x = 0; x <= n - 1; x++){
            System.out.println();
            for(y = 0; y <= n - 1; y++){
                System.out.print("\t" + matrizG [x][y]);
            }
        }

        sc.close();      
    }
}