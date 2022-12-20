//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para gerar uma matriz F (N x M). Criar os vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares)
da matriz. Imprimir a matriz e os vetores. Validar para caso não haja uma das duas possibilidades (sem elementos pares ou ímpares).
 */

import java.util.Scanner;
import java.util.Random;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = 0, j = 0, n = 0, m = 0;

        System.out.print("Entre com o número de linhas: ");
        i = sc.nextInt();

        System.out.print("Entre com o número de colunas: ");
        j = sc.nextInt();

        int matrizF [][] = new int [i][j];
        int vetorImpar [] = new int [i*j];
        int vetorPar [] = new int [i*j];

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
                matrizF [x][y] = random.nextInt(10);
                if(matrizF [x][y] % 2 == 0){
                    vetorPar[n] = matrizF [x][y];
                    n++;
                }
                else{
                    vetorImpar[m] = matrizF [x][y];
                    m++;
                }
            }
        }

        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matrizF [x][y]);
            }
        }

        System.out.println("\nVetor Par:");
        for(int x = 0; x <= n - 1; x++){
            System.out.print("\t" + vetorPar[x]);
        }
        
        System.out.println("\nVetor Impar:");
        for(int x = 0; x <= m - 1; x++){
            System.out.print("\t" + vetorImpar[x]);
        }

        sc.close();
    }
}