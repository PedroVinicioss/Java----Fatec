//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*Escreva um programa em Java para gerar uma matriz (N x M). O usuário deve informar uma faixa de valores inteiros positivos (valor inicial 
e valor final). O programa deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores fornecida pelo usuário. Ao final,
imprimir a matriz resultante.
*/

import java.util.Random;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = 0, j = 0, n = 0, m = 0;

        System.out.print("Entre com o número de linhas: ");
        i = sc.nextInt();

        System.out.print("Entre com o número de colunas: ");
        j = sc.nextInt();

        System.out.print("Entre com o número para o inicio do intervalo: ");
        n = sc.nextInt();

        System.out.print("Entre com o número para o fim do intervalo: ");
        m = sc.nextInt();

        int matriz [][] = new int [i][j];

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
                matriz [x][y] = random.nextInt(n, m + 1);              
            }
        }

        System.out.println("\nMatriz:");
        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matriz [x][y]);
            }
        }

        sc.close();
        
    }
}