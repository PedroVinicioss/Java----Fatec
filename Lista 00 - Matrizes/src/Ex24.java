//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz. Preencher a matriz com os elementos da sequencia 
de Fibonacci e imprimir o resultado.
*/

import java.util.Scanner;

public class Ex24{
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);

        int n = 0, m = 0, num1 = 1, num2 = 0;

        System.out.print("Entre com o número de linhas: ");
        n = sc.nextInt();

        System.out.print("Entre com o número de colunas: ");
        m = sc.nextInt();

        int matriz [][] = new int [n][n];

        for(int i = 0; i <= n - 1; i++){
            for(int j = 0; j <= m - 1; j++){
                if(i == 0 && j == 0){
                    matriz [i][j] = num2;
                    j++;
                    matriz [i][j] = num1;
                }
                else{
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    matriz [i][j] = num1;
                }
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