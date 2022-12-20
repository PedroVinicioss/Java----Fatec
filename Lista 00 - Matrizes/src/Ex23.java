//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.
*/

import java.util.Scanner;

public class Ex23{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = 0, m = 0, num = 3;

        System.out.print("Entre com o número de linhas: ");
        n = sc.nextInt();

        System.out.print("Entre com o número de colunas: ");
        m = sc.nextInt();

        int matriz [][] = new int [n][n];

        for(int i = 0; i <= n - 1; i++){
            for(int j = 0; j <= m - 1; j++){
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
        
        System.out.println("\nMatriz:");

        for(int x = 0; x <= n - 1; x++){
            System.out.println();
            for(int y = 0; y <= m - 1; y++){
                System.out.print("\t" + matriz [x][y]);
            }
        }

        sc.close();
    }
}