// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-003] Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número 
tipo double. Após verifique se o número é positivo, negativo ou zero. As verificações devem ser feitas
através de métodos.
*/

import java.util.Scanner;

import entities.isPositivo;

public class App {
    public static void main(String[] args) throws Exception {
                
        Scanner sc = new Scanner(System.in);

        isPositivo x;
        x = new isPositivo();

        System.out.println("Entre com um número: ");
        x.num = sc.nextDouble();

        int result = x.isTest();

        if(result == 1)
            System.out.println("O número " + x.num + " é Positivo.");
        else if(result == -1)
            System.out.println("O número " + x.num + " é Negativo.");
        else
            System.out.println("O número " + x.num + " é Zero.");

        sc.close();
    }
}