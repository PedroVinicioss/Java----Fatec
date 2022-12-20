//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*  Escreva um programa em Java para solicitar ao usuário um valor. Este valor lido será a quantidade de elementos de um vetor. Gerar os 
elementos do vetor. A partir do vetor gerado, criar uma matriz, onde a quantidade de linhas será igual à quantidade de elementos do vetor
e as colunas serão os valores dos elementos do vetor mais um. Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo
elemento do vetor criado inicialmente e os demais elementos da linha serão formados pela sequencia de Primos. Imprimir a matriz resultante.
*/

import java.util.Scanner;
import java.util.Random;

public class Ex29{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int tamanho = 0, maior = 0, num = 1;

        System.out.print("Entre com o tamanho do vetor: ");
        tamanho = sc.nextInt();

        int vetor [] = new int [tamanho];

        for(int i = 0; i <= tamanho - 1; i++){
            vetor [i] = random.nextInt(10);
            if(maior < vetor[i]){
                maior = vetor[i];
            }
        }

        int matriz [][] = new int [tamanho][maior + 1];

        for(int i = 0; i <= tamanho - 1; i++){
            num = 3;
            for(int j = 0; j <=vetor [i]; j++){
                if(j == 0){
                    matriz [i][j] = vetor [i];
                }else if(j == 1){
                    matriz [i][j] = 1;
                    matriz [i][j+1] = 2;
                    j++; 
                }else{
                    for(int x = 2; x < num; x++){
                        if(num % x == 0){
                            num++;
                            x = 2;
                        }
                        else{
                            matriz [i][j] = num;
                        }
                    }
                    num++;
                }
            }
        }

        System.out.println("\nMatriz:");

        for(int i = 0; i <= tamanho - 1; i++){
            System.out.println();
            for(int j = 0; j <= vetor[i]; j++){
                System.out.print("\t" + matriz [i][j]);
            }
        }

        sc.close();
    }
}