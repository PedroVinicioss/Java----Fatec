//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*  Exercicio anterior usando a sequencia de fibonacci.
*/

import java.util.Scanner;
import java.util.Random;

public class Ex30{
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int tamanho = 0, maior = 0, num1 = 1, num2 = 0;

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
            num1 = 1; num2 = 0;
            for(int j = 0; j <= vetor[i]; j++){
                if(j == 0){
                    matriz [i][j] = vetor [i];
                }else{
                        if(j == 1){
                            matriz [i][j] = num1;
                        }
                        else{
                            num1 = num1 + num2;
                            num2 = num1 - num2;
                            matriz [i][j] = num1;
                        }
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