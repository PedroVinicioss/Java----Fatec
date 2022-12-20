//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar uma terceira matriz (N x (M+P)), sendo que para 
cada linha concatenar suas respectivas colunas e apresentar as três matrizes.
*/

import java.util.Scanner;
import java.util.Random;

public class Ex21{
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = 0, m = 0, p = 0, a = 0;

        System.out.print("Entre com o número de linhas da matriz A e B: ");
        n = sc.nextInt();

        System.out.print("Entre com o número de colunas da matriz A: ");
        m = sc.nextInt();

        System.out.print("Entre com o número de colunas da matriz B: ");
        p = sc.nextInt();

        int matrizA [][] = new int [n][m];
        int matrizB [][] = new int [n][p];

        for(int x = 0; x <= n - 1; x++){
            for(int y = 0; y <= m - 1; y++){
                matrizA [x][y] = random.nextInt(25);
            }
        }
        
        for(int x = 0; x <= n - 1; x++){
            for(int y = 0; y <= p - 1; y++){
                matrizB [x][y] = random.nextInt(25);
            }
        }

        int matrizC [][] = new int [n][m + p];

        for(int x = 0; x <= n - 1; x++){
            a = 0;
            for(int y = 0; y <= m + p - 1; y++){
                if(y <= m - 1){
                    matrizC [x][y] = matrizA [x][y];
                }
                else{
                    matrizC [x][y] = matrizB [x][a];
                    a++;
                }
            }
        } 

        System.out.println("\nMatriz A:");

        for(int x = 0; x <= n - 1; x++){
            System.out.println();
            for(int y = 0; y <= m - 1; y++){
                System.out.print("\t" + matrizA [x][y]);
            }
        }

        System.out.println("\nMatriz B:");

        for(int x = 0; x <= n - 1; x++){
            System.out.println();
            for(int y = 0; y <= p - 1; y++){
                System.out.print("\t" + matrizB [x][y]);
            }
        }

        System.out.println("\nMatriz C:");

        for(int x = 0; x <= n - 1; x++){
            System.out.println();
            for(int y = 0; y <= m + p - 1; y++){
                System.out.print("\t" + matrizC [x][y]);
            }
        }

        sc.close();
    }
}