//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e
calcular a soma entre elas gerando uma terceira matriz.*/

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = 0, j = 0;

        System.out.print("Entre com o número de linhas: ");
        i = sc.nextInt();

        System.out.print("Entre com o número de colunas: ");
        j = sc.nextInt();

        int matrizD [][] = new int [i][j];
        int matrizE [][] = new int [i][j];
        int matrizF [][] = new int [i][j];

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
                matrizD [x][y] = random.nextInt(100);
                matrizE [x][y] = random.nextInt(100);
                matrizF [x][y] = matrizD [x][y] + matrizE [x][y];                
            }
        }

        System.out.println("\nMatriz 1:");
        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matrizD [x][y]);
            }
        }

        System.out.println("\nMatriz 2:");
        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matrizE [x][y]);
            }
        }

        System.out.println("\nMatriz 3:");
        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matrizF [x][y]);
            }
        }

        sc.close();
        
    }
}