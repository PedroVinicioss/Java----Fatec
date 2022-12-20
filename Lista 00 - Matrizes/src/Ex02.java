//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*Escreva um programa em Java para geral aleatoriamente os elementos (menor que 100) de uma matriz B de 6 linha por 3 colunas, 
imprimir a matriz gerada e imprimir a matriz em ordem invertida.*/

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        int matrizB [][] = new int [6][3];
        
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= 2; j++){
                matrizB [i][j] = random.nextInt(100);
            }
        }

        for(int i = 0; i <= 5; i++){
            System.out.println();
            for(int j = 0; j <= 2; j++){
                System.out.print("\t" + matrizB [i][j]);
            }
        }
    }
}