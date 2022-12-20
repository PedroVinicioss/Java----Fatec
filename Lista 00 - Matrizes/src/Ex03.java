//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para ler uma matriz C quadrada de dimensão N,
 onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
 número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados
 aleatoriamente (menor que 100). */

import java.util.Scanner;
import java.util.Random;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        
        int i = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while(j == 0){
            System.out.print("Entre com a dimenção da matriz: \n");
            i = sc.nextInt();
            if(i <= 20)
                j = 1;
            else
                System.out.print("Entre com um valor menor que 20!");
        }

        int matrizC [][] = new int [i][i];

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= i - 1; y++){
                matrizC[x][y] = random.nextInt(100);
            }
        }

        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= i - 1; y++){
                System.out.print("\t" + matrizC [x][y]);
            }
        }

        sc.close();
    }
}