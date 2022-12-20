//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para gerar uma matriz X (N x M). Ordenar as linhas
da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
*/

import java.util.Scanner;
import java.util.Random;

public class Ex27{
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = 0, aux = 0;

        System.out.print("Entre com a dimensão da matriz: ");
        n = sc.nextInt();

        int matriz [][] = new int [n][n];

        for(int i = 0; i <= n - 1; i++){
            for(int j = 0; j <= n - 1; j++){
                matriz [i][j] = random.nextInt(25);
            }
        }

        System.out.println("Matriz:");

        for(int i = 0; i <= n - 1; i++){
            System.out.println();
            for(int j = 0; j <= n - 1; j++){
                System.out.print("\t" + matriz[i][j]);
            }
        }

        for(int i = 0; i <= n - 1; i++){
            for(int j = 0; j <= n - 1; j++){
                for(int x = n - 1; x >= j; x--){
                    if(matriz[i][j] >= matriz[i][x]){
                        aux = matriz[i][j];
                        matriz[i][j] = matriz[i][x];
                        matriz[i][x] = aux;
                    }
                }
            }
        }


        System.out.println("\nMatriz Ordenada:");

        for(int i = 0; i <= n - 1; i++){
            System.out.println();
            for(int j = 0; j <= n - 1; j++){
                System.out.print("\t" + matriz[i][j]);
            }
        }

        sc.close();
        
    }
}