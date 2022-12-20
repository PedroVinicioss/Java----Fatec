//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*Escreva um programa em Java para gerar aleatoriamente (menor que 25) uma matriz N x M de dimensão definidas pelo usuário. Solicitar ao 
usuário um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na matriz, indicando a posição (linha X coluna) e no 
final a quantidade de ocorrências. */

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = 0, j = 0, num = 0, cont = 0;

        System.out.print("Entre com o número de linhas: ");
        i = sc.nextInt();

        System.out.print("Entre com o número de colunas: ");
        j = sc.nextInt();

        int matriz [][] = new int [i][j];

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
                matriz [x][y] = random.nextInt(25); 
            }
        }

        System.out.print("Entre com o número desejado: ");
        num = sc.nextInt();    
        
        for(int x = 0; x <= i - 1; x++){
            System.out.println();
            for(int y = 0; y <= j - 1; y++){
                System.out.print("\t" + matriz [x][y]);
            }
        }

        for(int x = 0; x <= i - 1; x++){
            for(int y = 0; y <= j - 1; y++){
                if(num == matriz [x][y]){
                    cont++;
                    System.out.println("\nValor encontrado na linha " + x + " e coluna " + y);
                }
            }
        }        

        System.out.println("\nForam encontrados um total de " + cont + " números equivalentes");

        sc.close();
    }
}