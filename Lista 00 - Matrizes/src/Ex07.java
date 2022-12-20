//Pedro Vinicios de Oliveira Ribeiro dos Santos

/* Escreva um programa em Java para gerar uma matriz E de dimensão N x M, determinar e imprimir o maior e o menor elemento deste conjunto, 
informando a posição dos mesmos.*/

import java.util.Scanner;
import java.util.Random;

public class Ex07 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = 0, j = 0, maior = 0, menor = 0, localMaior_x = 0, localMaior_y = 0, localMenor_x = 0, localMenor_y = 0;

        System.out.print("Entre com o número de linhas: ");
        i = sc.nextInt();

        System.out.print("Entre com o número de colunas: ");
        j = sc.nextInt();

        int matrizE [][] = new int [i][j];

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
                matrizE [x][y] = random.nextInt(25);             
            }
        }

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
              
                if(x == 0 && y == 0){
                    maior = matrizE [x][y];
                    menor = matrizE [x][y];
                }
                else{
                    
                    if(matrizE [x][y] > maior)
                    {
                        maior = matrizE [x][y];
                        localMaior_x = x;
                        localMaior_y = y;
                    }else if(matrizE [x][y] < menor){
                        menor = matrizE [x][y];
                        localMenor_x = x;
                        localMenor_y = y;
                    }
                }             
            }
        }  
        
        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matrizE [x][y]);
            }
        }
        
        System.out.println("\nO maior valor foi: " + maior + " encontrado na linha " + localMaior_x + " e coluna " + localMaior_y);
        System.out.println("O menor valor foi: " + menor + " encontrado na linha " + localMenor_x + " e coluna " + localMenor_y);

        sc.close();
    }
}