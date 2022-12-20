//Pedro Vinicios de Oliveira Ribeiro dos Santos

// Escreva um programa em Java para ler uma matriz A de 4 linhas por 5 colunas e imprimir seus elementos.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        int matrizA [][] = new int [4][5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 4; j++){
                System.out.print("Entre com o valor da linha " + i + " e coluna " + j + "\n");
                matrizA[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i <= 3; i++){
            System.out.println();
            for(int j = 0; j <= 4; j++){
                System.out.print("\t" + matrizA[i][j]);
            }
        }

        sc.close();
    }
}
