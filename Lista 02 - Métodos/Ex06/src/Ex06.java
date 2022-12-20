// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-011] Crie um programa que solicite ao usuário números inteiros. A cada número inserido, 
perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o 
menor dos valores.
 */

import java.util.Scanner;
import entities.Maiorr;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Maiorr valor = new Maiorr();

        int i = 0, x = 0, result = 0;

        while(i == 0){

            System.out.print("Entre com o número: ");
            x = sc.nextInt();
            
            System.out.print("Inserir outro [s/n]:");
            char resp = sc.next().charAt(0);
            if(resp == 'n')
                i = 1;
            else
                result = valor.Maior(x);
        }


        System.out.print("O Maior é: " + result);

        sc.close();
    }
}
